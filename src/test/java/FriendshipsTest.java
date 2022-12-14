import java.util.Collections;

import org.example.Friendships;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class FriendshipsTest {


    @Test
    public void makeFriendsTest() {
        Friendships friends = new Friendships();

        friends.makeFriends("Wanda", "Emyn");
        assertTrue(friends.areFriends("Wanda", "Emyn"));
    }

    @Test
    public void isFriendshipListNotEmptyTest() {
        Friendships friends = new Friendships();
        friends.makeFriends("Mark", "Adam");
        Assertions.assertNotEquals(Collections.EMPTY_LIST, friends.getFriendsList("Adam"));

    }

    @Test
    public void friendshipListSizeTest() {
        Friendships friends = new Friendships();

        friends.makeFriends("Wanda", "Emyn");
        friends.makeFriends("Wanda", "Dodo");

        assertEquals(friends.getFriendsList("Wanda").size(), 2);
    }

    @Test
    public void checkIfFriendsBackwardsTest() {
        Friendships friends = new Friendships();

        friends.makeFriends("Wanda", "Emyn");
        assertTrue(friends.areFriends("Emyn", "Wanda"));
    }

}