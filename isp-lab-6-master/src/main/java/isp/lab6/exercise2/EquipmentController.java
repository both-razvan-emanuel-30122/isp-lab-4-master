package isp.lab6.exercise2;

import java.util.*;

public class EquipmentController {
    public List<Equipment> equipmentList;

    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        this.equipmentList.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return this.equipmentList;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return this.equipmentList.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> ListByOwner = new HashMap<>();
        List<Equipment> equipmentList = new ArrayList<>();
        for (Equipment equipment : this.equipmentList
        ) {
            String currentOwner = equipment.getOwner();
            equipmentList.clear();
            if (!ListByOwner.containsKey(currentOwner)) {
                for (Equipment equipmentByOwner : this.equipmentList
                ) {
                    if (Objects.equals(equipmentByOwner.getOwner(), currentOwner)) {
                        equipmentList.add(equipment);
                    }
                }
            }
            ListByOwner.put(currentOwner, equipmentList);
        }
        return ListByOwner;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     *
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for (Equipment equipment : this.equipmentList
        ) {
            if (equipment.getSerialNumber() == serialNumber) {
                equipmentList.remove(equipment);
                return equipment;
            }
        }
        return null;
    }
}
