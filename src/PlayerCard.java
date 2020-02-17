/**
 * A model of a player card. Each player card has a stat of acceleration, sprint
 * speed, finishing, shot power, long shot, positioning, penalties, volley,
 * short passing, long passing, vision, crossing, curve, free kick, dribbling,
 * ball control, agility, reactions, balance, marking, standing tackle, sliding
 * tackle, interceptions, heading, strength, aggression and jumping.
 * 
 * @author MSN
 *
 */
public class PlayerCard {

	private int number;
	private String card;
	private String skillBoost;
	private int acceleration;
	private int sprintSpeed;
	private int finishing;
	private int shotPower;
	private int longShot;
	private int positioning;
	private int penalties;
	private int volley;
	private int shortPassing;
	private int longPassing;
	private int vision;
	private int crossing;
	private int curve;
	private int freeKick;
	private int dribbling;
	private int ballControl;
	private int agility;
	private int reactions;
	private int balance;
	private int marking;
	private int standingTackle;
	private int slidingTackle;
	private int interceptions;
	private int heading;
	private int strength;
	private int aggression;
	private int jumping;

	public PlayerCard(int number, String card, String skillBoost, int acceleration, int sprintSpeed, int finishing,
			int shotPower, int longShot, int positioning, int penalties, int volley, int shortPassing, int longPassing,
			int vision, int crossing, int curve, int freeKick, int dribbling, int ballControl, int agility,
			int reactions, int balance, int marking, int standingTackle, int slidingTackle, int interceptions,
			int heading, int strength, int aggression, int jumping) {
		this.number = number;
		this.card = card;
		this.skillBoost = skillBoost;
		this.acceleration = acceleration;
		this.sprintSpeed = sprintSpeed;
		this.finishing = finishing;
		this.shotPower = shotPower;
		this.longShot = longShot;
		this.positioning = positioning;
		this.penalties = penalties;
		this.volley = volley;
		this.shortPassing = shortPassing;
		this.longPassing = longPassing;
		this.vision = vision;
		this.crossing = crossing;
		this.curve = curve;
		this.freeKick = freeKick;
		this.dribbling = dribbling;
		this.ballControl = ballControl;
		this.agility = agility;
		this.reactions = reactions;
		this.balance = balance;
		this.marking = marking;
		this.standingTackle = standingTackle;
		this.slidingTackle = slidingTackle;
		this.interceptions = interceptions;
		this.heading = heading;
		this.strength = strength;
		this.aggression = aggression;
		this.jumping = jumping;
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

	public int getFinishing() {
		return finishing;
	}

	public void setFinishing(int finishing) {
		this.finishing = finishing;
	}

	public int getShotPower() {
		return shotPower;
	}

	public void setShotPower(int shotPower) {
		this.shotPower = shotPower;
	}

	public int getLongShot() {
		return longShot;
	}

	public void setLongShot(int longShot) {
		this.longShot = longShot;
	}

	public int getPositioning() {
		return positioning;
	}

	public void setPositioning(int positioning) {
		this.positioning = positioning;
	}

	public int getPenalties() {
		return penalties;
	}

	public void setPenalties(int penalties) {
		this.penalties = penalties;
	}

	public int getVolley() {
		return volley;
	}

	public void setVolley(int volley) {
		this.volley = volley;
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

	public int getDribbling() {
		return dribbling;
	}

	public void setDribbling(int dribbling) {
		this.dribbling = dribbling;
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

	public int getMarking() {
		return marking;
	}

	public void setMarking(int marking) {
		this.marking = marking;
	}

	public int getStandingTackle() {
		return standingTackle;
	}

	public void setStandingTackle(int standingTackle) {
		this.standingTackle = standingTackle;
	}

	public int getSlidingTackle() {
		return slidingTackle;
	}

	public void setSlidingTackle(int slidingTackle) {
		this.slidingTackle = slidingTackle;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getHeading() {
		return heading;
	}

	public void setHeading(int heading) {
		this.heading = heading;
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

}
