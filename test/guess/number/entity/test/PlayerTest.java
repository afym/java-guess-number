package guess.number.entity.test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Test;

import guess.number.entity.Player;

public class PlayerTest {

	@Test
	public void testInstance() {
		Player player = new Player();
		assertThat(player, instanceOf(Player.class));
	}

	@Test
	public void testGetSet() {
		Player player = new Player();
		String name = "Angel";
		player.setName(name);
	}
}
