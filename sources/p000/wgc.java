package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: wgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgc {

    /* renamed from: a */
    private static final ComponentName f50613a = new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.FamilyManagementActivity");

    static {
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.manage.DeleteMemberActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.create.FamilyCreationActivity");
        new ComponentName("com.google.android.gms", "com.google.android.gms.family.v2.invites.SendInvitationsActivity");
    }

    /* renamed from: a */
    public static Intent m41905a(wgd wgd) {
        return new Intent().setComponent(f50613a).putExtras(new Bundle(((wge) wgd).f50615b));
    }

    /* renamed from: a */
    public static String m41906a(String str) {
        return str.length() == 0 ? new String("com.google.android.gms.family.") : "com.google.android.gms.family.".concat(str);
    }
}
