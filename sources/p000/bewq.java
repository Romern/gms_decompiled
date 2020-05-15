package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bewq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewq {

    /* renamed from: b */
    private static final Object f112847b = new Object();

    /* renamed from: c */
    private static bewq f112848c;

    /* renamed from: a */
    public final qws f112849a;

    private bewq(Context context) {
        this.f112849a = new qws(context, "ACTIVITY_RECOGNITION", null);
    }

    /* renamed from: a */
    public static bewq m95998a(Context context) {
        bewq bewq;
        synchronized (f112847b) {
            if (f112848c == null) {
                f112848c = new bewq(context.getApplicationContext());
            }
            bewq = f112848c;
        }
        return bewq;
    }

    /* renamed from: a */
    public static btyc m95999a(String str, String str2) {
        bxvd da = btyc.f152879d.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btyc btyc = (btyc) da.f164949b;
            str.getClass();
            btyc.f152881a |= 1;
            btyc.f152882b = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btyc btyc2 = (btyc) da.f164949b;
            str2.getClass();
            btyc2.f152881a |= 2;
            btyc2.f152883c = str2;
        }
        return (btyc) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo61203a(int i) {
        int i2 = i - 1;
        String valueOf = String.valueOf(Integer.toString(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("logging dnd notification action, action type = ");
        sb.append(valueOf);
        sb.toString();
        bxvd da = btyu.f152982d.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btyu btyu = (btyu) da.f164949b;
        int i3 = btyu.f152984a | 2;
        btyu.f152984a = i3;
        btyu.f152986c = currentTimeMillis;
        btyu.f152985b = i2;
        btyu.f152984a = i3 | 1;
        btyu btyu2 = (btyu) da.mo74062i();
        bxvd da2 = btxm.f152814q.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btxm btxm = (btxm) da2.f164949b;
        btyu2.getClass();
        btxm.f152821f = btyu2;
        btxm.f152816a |= 32;
        qwo a = this.f112849a.mo24333a((btxm) da2.mo74062i());
        a.mo24328b(7);
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo61204a(btzg btzg) {
        bxvd da = btxm.f152814q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btxm btxm = (btxm) da.f164949b;
        btzg.getClass();
        btxm.f152829n = btzg;
        btxm.f152816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        qwo a = this.f112849a.mo24333a((btxm) da.mo74062i());
        a.mo24328b(16);
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo61205a(String str, String str2, int i, long j) {
        bxvd da = btxm.f152814q.mo74144da();
        bxvd da2 = btxr.f152840f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btxr btxr = (btxr) da2.f164949b;
        btxr.f152843b = i - 1;
        btxr.f152842a |= 1;
        btyc a = m95999a(str, str2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btxr btxr2 = (btxr) da2.f164949b;
        a.getClass();
        btxr2.f152844c = a;
        int i2 = btxr2.f152842a | 2;
        btxr2.f152842a = i2;
        btxr2.f152845d = 1;
        int i3 = i2 | 4;
        btxr2.f152842a = i3;
        btxr2.f152842a = i3 | 8;
        btxr2.f152846e = j;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btxm btxm = (btxm) da.f164949b;
        btxr btxr3 = (btxr) da2.mo74062i();
        btxr3.getClass();
        btxm.f152822g = btxr3;
        btxm.f152816a |= 64;
        qwo a2 = this.f112849a.mo24333a((btxm) da.mo74062i());
        a2.mo24328b(8);
        a2.mo24327b();
    }

    /* renamed from: a */
    public final void mo61206a(boolean z, int i) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("logging dnd rule status, ruleEnabled = ");
        sb.append(z);
        sb.toString();
        bxvd da = btys.f152975e.mo74144da();
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btys btys = (btys) da.f164949b;
        int i2 = btys.f152977a | 1;
        btys.f152977a = i2;
        btys.f152978b = currentTimeMillis;
        int i3 = i2 | 2;
        btys.f152977a = i3;
        btys.f152979c = z;
        btys.f152980d = i - 1;
        btys.f152977a = i3 | 64;
        btys btys2 = (btys) da.mo74062i();
        bxvd da2 = btxm.f152814q.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btxm btxm = (btxm) da2.f164949b;
        btys2.getClass();
        btxm.f152819d = btys2;
        btxm.f152816a |= 4;
        qwo a = this.f112849a.mo24333a((btxm) da2.mo74062i());
        a.mo24328b(4);
        a.mo24327b();
    }
}
