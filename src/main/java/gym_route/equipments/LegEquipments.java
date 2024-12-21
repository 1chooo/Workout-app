package gym_route.equipments;

import gym_route.parts.LEG;

public class LegEquipments {
    private static final String MECHANICAL_HIP_KICKBACK = "機械臀後踢";
    private static final String SMITH_CURTSY_LUNGE = "史密斯屈膝禮弓步";
    private static final String DUMBBELL_SINGLE_LEG_SQUAT = "啞鈴單腳蹲";
    private static final String SMITH_FRONT_SQUAT = "史密斯頸前蹲";
    private static final String MECHANICAL_LEG_ADDUCTION = "機械腿內收";
    private static final String SMITH_GOOD_MORNING = "史密斯早安式";
    private static final String ROMANIAN_DEADLIFT = "羅馬尼亞硬舉";
    private static final String DUMBBELL_BULGARIAN_SPLIT_SQUAT = "啞鈴保加利亞蹲";
    private static final String SMITH_HIP_BRIDGE = "史密斯臀橋";
    private static final String SMITH_SQUAT = "史密斯深蹲";

    private String[] legMechanical = {
            "機械腿推", "機械腿伸展", "機械坐式腿屈曲", "機械臥式腿屈曲",
            "機械腿外展", MECHANICAL_LEG_ADDUCTION, "機械小腿伸展", MECHANICAL_HIP_KICKBACK,
            "機械臀橋", SMITH_GOOD_MORNING, SMITH_SQUAT, SMITH_CURTSY_LUNGE,
            "史密斯保加利亞蹲", SMITH_FRONT_SQUAT, "史密斯哈克蹲", SMITH_HIP_BRIDGE };
    private String[] legCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] legFreeWeight = {
            "深蹲", DUMBBELL_SINGLE_LEG_SQUAT, DUMBBELL_BULGARIAN_SPLIT_SQUAT, "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", ROMANIAN_DEADLIFT, "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋", "啞鈴提腫" };
    private BodyPartEquipment legEquipment = new BodyPartEquipment(
            LEG.LEG, legMechanical,
            legCable, legFreeWeight);

    private String[] hipMechanical = {
            "機械腿推", "機械腿外展", MECHANICAL_LEG_ADDUCTION, MECHANICAL_HIP_KICKBACK,
            "機械臀橋", SMITH_GOOD_MORNING, SMITH_SQUAT, SMITH_CURTSY_LUNGE,
            "史密斯保加利亞蹲", SMITH_FRONT_SQUAT, "史密斯哈克蹲", SMITH_HIP_BRIDGE };
    private String[] hipCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] hipFreeWeight = {
            "深蹲", DUMBBELL_SINGLE_LEG_SQUAT, DUMBBELL_BULGARIAN_SPLIT_SQUAT, "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", ROMANIAN_DEADLIFT, "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋" };
    private BodyPartEquipment hipEquipment = new BodyPartEquipment(
            LEG.HIP, hipMechanical,
            hipCable, hipFreeWeight);

    private String[] quadricepsMechanical = {
            "機械腿推", DUMBBELL_SINGLE_LEG_SQUAT, "機械腿伸展", SMITH_SQUAT,
            SMITH_CURTSY_LUNGE, "史密斯保加利亞蹲", SMITH_FRONT_SQUAT, "史密斯哈克蹲" };
    private String[] quadricepsCable = {
    };
    private String[] quadricepsFreeWeight = {
            "深蹲", DUMBBELL_SINGLE_LEG_SQUAT, DUMBBELL_BULGARIAN_SPLIT_SQUAT, "啞鈴跨步蹲",
            "硬舉", ROMANIAN_DEADLIFT, "啞鈴相撲蹲", "相撲硬舉" };
    private BodyPartEquipment quadricepsEquipment = new BodyPartEquipment(
            LEG.QUADRICEPS, quadricepsMechanical,
            quadricepsCable, quadricepsFreeWeight);

    private String[] hamstringsMechanical = {
            "機械腿推", "機械坐式腿屈曲", "機械臥式腿屈曲", "機械腿外展",
            MECHANICAL_LEG_ADDUCTION, MECHANICAL_HIP_KICKBACK, "機械臀橋", SMITH_GOOD_MORNING,
            SMITH_SQUAT, SMITH_CURTSY_LUNGE, "史密斯保加利亞蹲", SMITH_FRONT_SQUAT,
            "史密斯哈克蹲", SMITH_HIP_BRIDGE };
    private String[] hamstringsCable = {
            "cable後踢", "cable側踢", "cable腿內收" };
    private String[] hamstringsFreeWeight = {
            "深蹲", DUMBBELL_SINGLE_LEG_SQUAT, DUMBBELL_BULGARIAN_SPLIT_SQUAT, "啞鈴跨步蹲",
            "硬舉", "直膝硬舉", ROMANIAN_DEADLIFT, "啞鈴相撲蹲",
            "相撲硬舉", "槓鈴臀橋" };
    private BodyPartEquipment hamstringsEquipment = new BodyPartEquipment(
            LEG.HAMSTRINGS, hamstringsMechanical,
            hamstringsCable, hamstringsFreeWeight);

    private String[] calfMechanical = {
            "機械小腿伸展" };
    private String[] calfCable = {
    };
    private String[] calfFreeWeight = {
            "啞鈴提腫" };
    private BodyPartEquipment calfEquipment = new BodyPartEquipment(
            LEG.CALF, calfMechanical,
            calfCable, calfFreeWeight);

    public LegEquipments() {
    }

    public BodyPartEquipment getLegEquipment() {
        return legEquipment;
    }

    public BodyPartEquipment getHipEquipment() {
        return hipEquipment;
    }

    public BodyPartEquipment getHamstringsEquipment() {
        return hamstringsEquipment;
    }

    public BodyPartEquipment getQuadricepsEquipment() {
        return quadricepsEquipment;
    }

    public BodyPartEquipment getCalfEquipment() {
        return calfEquipment;
    }

}
