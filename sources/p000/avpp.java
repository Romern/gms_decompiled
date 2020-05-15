package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: avpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpp {

    /* renamed from: a */
    public static final avto f93721a = new avto("logging.clearcut_event_logger.current_execution_id", "");

    /* renamed from: c */
    private static final sek f93722c = new sek("SystemUpdate", "Logging", "ClearcutEventLogger");

    /* renamed from: d */
    private static final bnic f93723d = bnic.m109490a("com.google.android.gms", "com.google.android.gms.update");

    /* renamed from: b */
    public final avtn f93724b = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: e */
    private final bnic f93725e;

    /* renamed from: f */
    private final qws f93726f;

    /* renamed from: g */
    private final int f93727g;

    private avpp(Context context) {
        this.f93726f = new qws(context, "ANDROID_OTA", null);
        this.f93727g = avma.m78774b(context);
        bnia j = bnic.m109500j();
        for (String str : bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) cfsg.f185570a.mo6606a().mo82633e())) {
            try {
                j.mo67629b(Integer.valueOf(str));
            } catch (NumberFormatException e) {
                f93722c.mo25416d("Failed to parse event type: %s.", str);
            }
        }
        this.f93725e = j.mo67751a();
    }

    /* renamed from: a */
    public static avpp m79008a(Context context) {
        return new avpp(context);
    }

    /* renamed from: a */
    public final bxvd mo51476a(int i) {
        bxvd da = bohn.f133102n.mo74144da();
        if (f93723d.contains(ssy.m36271a())) {
            String str = (String) this.f93724b.mo51607b(f93721a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohn bohn = (bohn) da.f164949b;
            str.getClass();
            bohn.f133104a |= 2;
            bohn.f133106c = str;
        }
        int i2 = this.f93727g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bohn bohn2 = (bohn) da.f164949b;
        int i3 = bohn2.f133104a | 4;
        bohn2.f133104a = i3;
        bohn2.f133107d = i2;
        bohn2.f133105b = i - 1;
        bohn2.f133104a = i3 | 1;
        return da;
    }

    /* renamed from: a */
    public final void mo51477a(bohk bohk) {
        bxvd a = mo51476a(11);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bohn bohn = (bohn) a.f164949b;
        bohn bohn2 = bohn.f133102n;
        bohk.getClass();
        bohn.f133116m = bohk;
        bohn.f133104a |= 2048;
        mo51478a((bohn) a.mo74062i());
    }

    /* renamed from: a */
    public final void mo51478a(bohn bohn) {
        bnic bnic = this.f93725e;
        int a = bohm.m111208a(bohn.f133105b);
        if (a == 0) {
            a = 1;
        }
        if (bnic.contains(Integer.valueOf(a - 1))) {
            this.f93726f.mo24333a(bohn).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo51479a(bohp bohp) {
        bxvd a = mo51476a(3);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bohn bohn = (bohn) a.f164949b;
        bohn bohn2 = bohn.f133102n;
        bohp.getClass();
        bohn.f133108e = bohp;
        bohn.f133104a |= 8;
        mo51478a((bohn) a.mo74062i());
    }

    /* renamed from: a */
    public final void mo51480a(bohu bohu) {
        bxvd a = mo51476a(7);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bohn bohn = (bohn) a.f164949b;
        bohn bohn2 = bohn.f133102n;
        bohu.getClass();
        bohn.f133113j = bohu;
        bohn.f133104a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo51478a((bohn) a.mo74062i());
    }
}
