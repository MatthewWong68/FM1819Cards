/**
 * A model of a keeper card. Each keeper card has a stat of diving, gk
 * positioning, reflexes, handling, kicking, ball control, agility,
 * short passing, long passing, vision, crossing, curve, free kick, dribbling,
 * ball control, agility, reactions, balance, marking, standing tackle, sliding
 * tackle, interceptions, heading, strength, aggression and jumping.
 * 
 * @author MSN
 *
 */
public class KeeperCard {

	private int number;
	private String card;
	private String skillBoost;
	private int diving;
	private int gKPositioning;
	private int reflexes;
	private int handling;
	private int kicking;
	private int ballControl;
	private int agility;
	private int reactions;
	private int balance;
	private int strength;
	private int aggression;
	private int jumping;
	private int acceleration;
	private int sprintSpeed;
	private int penalties;
	private int shortPassing;
	private int longPassing;
	private int vision;
	private int crossing;
	private int curve;
	private int freeKick;
	private int slidingTackle;

	public KeeperCard(int number, String card, String skillBoost, int diving, int gKPositioning, int reflexes,
			int handling, int kicking, int ballControl, int agility, int reactions, int balance, int strength,
			int aggression, int jumping, int acceleration, int sprintSpeed, int penalties, int shortPassing,
			int longPassing, int vision, int crossing, int curve, int freeKick, int slidingTackle) {
		this.number = number;
		this.card = card;
		this.skillBoost = skillBoost;
		this.diving = diving;
		this.gKPositioning = gKPositioning;
		this.reflexes = reflexes;
		this.handling = handling;
		this.kicking = kicking;
		this.ballControl = ballControl;
		this.agility = agility;
		this.reactions = reactions;
		this.balance = balance;
		this.strength = strength;
		this.aggression = aggression;
		this.jumping = jumping;
		this.acceleration = acceleration;
		this.sprintSpeed = sprintSpeed;
		this.penalties = penalties;
		this.shortPassing = shortPassing;
		this.longPassing = longPassing;
		this.vision = vision;
		this.crossing = crossing;
		this.curve = curve;
		this.freeKick = freeKick;
		this.slidingTackle = slidingTackle;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getSkillBoost() {
		return skillBoost;
	}

	public void setSkillBoost(String skillBoost) {
		this.skillBoost = skillBoost;
	}

	public int getDiving() {
		return diving;
	}

	public void setDiving(int diving) {
		this.diving = diving;
	}

	public int getGKPositioning() {
		return gKPositioning;
	}

	public void setGKPositioning(int gKPositioning) {
		this.gKPositioning = gKPositioning;
	}

	public int getReflexes() {
		return reflexes;
	}

	public void setReflexes(int reflexes) {
		this.reflexes = reflexes;
	}

	public int getHandling() {
		return handling;
	}

	public void setHandling(int handling) {
		this.handling = handling;
	}

	public int getKicking() {
		return kicking;
	}

	public void setKicking(int kicking) {
		this.kicking = kicking;
	}

	public int getBallControl() {
		return ballControl;
	}

	public void setBallControl(int ballControl) {
		this.ballControl = ballControl;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getReactions() {
		return reactions;
	}

	public void setReactions(int reactions) {
		this.reactions = reactions;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAggression() {
		return aggression;
	}

	public void setAggression(int aggression) {
		this.aggression = aggression;
	}

	public int getJumping() {
		return jumping;
	}

	public void setJumping(int jumping) {
		this.jumping = jumping;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getSprintSpeed() {
		return sprintSpeed;
	}

	public void setSprintSpeed(int sprintSpeed) {
		this.sprintSpeed = sprintSpeed;
	}

	public int getPenalties() {
		return penalties;
	}

	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}

	public int getShortPassing() {
		return shortPassing;
	}

	public void setShortPassing(int shortPassing) {
		this.shortPassing = shortPassing;
	}

	public int getLongPassing() {
		return longPassing;
	}

	public void setLongPassing(int longPassing) {
		this.longPassing = longPassing;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getCrossing() {
		return crossing;
	}

	public void setCrossing(int crossing) {
		this.crossing = crossing;
	}

	public int getCurve() {
		return curve;
	}

	public void setCurve(int curve) {
		this.curve = curve;
	}

	public int getFreeKick() {
		return freeKick;
	}

	public void setFreeKick(int freeKick) {
		this.freeKick = freeKick;
	}

	public int getSlidingTackle() {
		return slidingTackle;
	}

	public void setSlidingTackle(int slidingTackle) {
		this.slidingTackle = slidingTackle;
	}

}