package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcia {
    /* renamed from: k */
    public static bchx m89091k() {
        return new bchx();
    }

    /* renamed from: a */
    public abstract bcuu mo56868a();

    /* renamed from: b */
    public abstract boolean mo56869b();

    /* renamed from: c */
    public abstract bchz mo56870c();

    /* renamed from: d */
    public abstract bchx mo56871d();

    /* renamed from: e */
    public final bctr mo56912e() {
        return mo56870c().mo56787c();
    }

    /* renamed from: f */
    public final bchu mo56913f() {
        return mo56870c().mo56791d();
    }

    /* renamed from: g */
    public final bchw mo56914g() {
        return mo56870c().mo56795e();
    }

    /* renamed from: h */
    public final bcic mo56915h() {
        return mo56870c().mo56800f();
    }

    /* renamed from: i */
    public final bchh mo56916i() {
        return mo56870c().mo56782a();
    }

    /* renamed from: j */
    public final ConversationId mo56917j() {
        int l = mo56918l();
        int i = l - 1;
        if (l == 0) {
            throw null;
        } else if (i == 0) {
            return mo56912e().mo57361c();
        } else {
            if (i == 2) {
                return mo56914g().mo56864e();
            }
            if (i == 3) {
                return mo56915h().mo56876b();
            }
            if (i == 4 && mo56916i().mo56886c() == 1) {
                return mo56916i().mo56885b().mo56825a();
            }
            return null;
        }
    }

    /* renamed from: l */
    public final int mo56918l() {
        return mo56870c().mo56783b();
    }
}
