package p000;

import com.google.android.gms.common.api.Scope;

/* renamed from: addd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addd {
    /* renamed from: a */
    public static bong m50199a(String str, Scope[] scopeArr, aqkt aqkt) {
        return m50200a(str, scopeArr, aqkt.f86312g, aqkt.f86308c, aqkt.f86310e, aqkt.f86307b);
    }

    /* renamed from: a */
    public static bong m50200a(String str, Scope[] scopeArr, String str2, boolean z, boolean z2, boolean z3) {
        bxvd da = bond.f133767h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bond bond = (bond) da.f164949b;
        int i = bond.f133769a | 8;
        bond.f133769a = i;
        bond.f133773e = z;
        int i2 = i | 32;
        bond.f133769a = i2;
        bond.f133775g = z2;
        bond.f133769a = i2 | 16;
        bond.f133774f = z3;
        if (scopeArr != null) {
            bnic c = bnfi.m109237a(scopeArr).mo67501a(addc.f61430a).mo67508c();
            boolean contains = c.contains("email");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bond bond2 = (bond) da.f164949b;
            bond2.f133769a |= 2;
            bond2.f133771c = contains;
            boolean contains2 = c.contains("profile");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bond bond3 = (bond) da.f164949b;
            bond3.f133769a |= 4;
            bond3.f133772d = contains2;
            boolean contains3 = c.contains("openid");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bond bond4 = (bond) da.f164949b;
            bond4.f133769a |= 1;
            bond4.f133770b = contains3;
        }
        bxvd da2 = bone.f133776d.mo74144da();
        bond bond5 = (bond) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bone bone = (bone) da2.f164949b;
        bond5.getClass();
        bone.f133779b = bond5;
        int i3 = bone.f133778a | 1;
        bone.f133778a = i3;
        if (str != null) {
            str.getClass();
            bone.f133778a = i3 | 2;
            bone.f133780c = str;
        }
        bxvd da3 = bong.f133782r.mo74144da();
        if (str2 != null) {
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bong bong = (bong) da3.f164949b;
            str2.getClass();
            bong.f133784a |= 2;
            bong.f133786c = str2;
        }
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bong bong2 = (bong) da3.f164949b;
        bong2.f133785b = 4;
        bong2.f133784a |= 1;
        bone bone2 = (bone) da2.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bong bong3 = (bong) da3.f164949b;
        bone2.getClass();
        bong3.f133789f = bone2;
        bong3.f133784a |= 16;
        return (bong) da3.mo74062i();
    }
}
