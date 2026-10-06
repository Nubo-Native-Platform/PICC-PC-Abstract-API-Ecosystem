package com.nubons.nnp.sso.abs.keycloak.to;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
public class UserInfoResponseTO {
	private String sub;
	private boolean email_verified;
    private List<String> groups;
    private String preferred_username;
    private String given_name;
    private String family_name;
}
