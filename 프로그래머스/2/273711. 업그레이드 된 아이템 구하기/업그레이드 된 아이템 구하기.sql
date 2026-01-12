select a.item_id, a.item_name, a.rarity
from item_info a, item_tree b
where a.item_id = b.item_id
and b.parent_item_id in (select item_id
                          from item_info
                          where rarity = 'RARE'
                          )
order by item_id desc
;