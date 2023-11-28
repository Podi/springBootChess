package edu.corvinus.springBootLottery.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "player_roles",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
    @ElementCollection
    private List<ArrayList<Integer>> numberSelections = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public List<ArrayList<Integer>> getNumberSelections() {
        return numberSelections;
    }

    public void setNumberSelections(List<ArrayList<Integer>> numberSelections) {
        this.numberSelections = numberSelections;
    }


    public void addNumbers(ArrayList<Integer> numbers) {
        this.numberSelections.add(numbers);
    }
}