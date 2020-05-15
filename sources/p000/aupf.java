package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.common.p070ui.ConfirmUserCredentialAndStartChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: aupf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aupf {

    /* renamed from: r */
    private static final SparseArray f92247r;

    /* renamed from: a */
    public String f92248a;

    /* renamed from: b */
    public String f92249b;

    /* renamed from: c */
    public String f92250c;

    /* renamed from: d */
    public PendingIntent f92251d = null;

    /* renamed from: e */
    public PendingIntent f92252e;

    /* renamed from: f */
    public bogq f92253f;

    /* renamed from: g */
    public int f92254g;

    /* renamed from: h */
    public String f92255h;

    /* renamed from: i */
    public String f92256i;

    /* renamed from: j */
    public String f92257j;

    /* renamed from: k */
    public int f92258k;

    /* renamed from: l */
    public int f92259l;

    /* renamed from: m */
    public Bitmap f92260m;

    /* renamed from: n */
    public Bundle f92261n;

    /* renamed from: o */
    public String f92262o;

    /* renamed from: p */
    public final ArrayList f92263p;

    /* renamed from: q */
    public int f92264q;

    /* renamed from: s */
    private final Context f92265s;

    /* renamed from: t */
    private int f92266t;

    static {
        SparseArray sparseArray = new SparseArray();
        f92247r = sparseArray;
        sparseArray.put(0, new HashSet(Arrays.asList(bogq.ONBODY_LURE)));
        f92247r.put(4, new HashSet(Arrays.asList(bogq.PLACE_LURE)));
    }

    public aupf(Context context) {
        this.f92265s = context;
        this.f92248a = context.getString(C0126R.string.auth_google_trust_agent_title);
        this.f92254g = qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_lock_outline_white_24);
        this.f92249b = "";
        this.f92250c = "";
        this.f92255h = "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings";
        this.f92256i = null;
        this.f92257j = null;
        this.f92266t = 0;
        this.f92258k = 134217728;
        this.f92262o = null;
        this.f92260m = null;
        this.f92261n = null;
        this.f92252e = null;
        this.f92263p = new ArrayList();
        this.f92259l = 0;
        this.f92264q = 0;
        this.f92253f = null;
    }

    /* renamed from: a */
    public static int m77548a() {
        return new Random().nextInt();
    }

    /* renamed from: b */
    public final boolean mo50787b() {
        int i;
        bogq bogq = this.f92253f;
        if (!(bogq == null || f92247r.get(bogq.f133019h) == null)) {
            SharedPreferences a = aupo.m77578a(this.f92265s);
            long currentTimeMillis = System.currentTimeMillis();
            for (bogq bogq2 : (Set) f92247r.get(this.f92253f.f133019h)) {
                if (currentTimeMillis - a.getLong(m77550a(bogq2), 0) <= cgzt.f188132a.mo6606a().mo84824i()) {
                    return false;
                }
            }
        }
        C1102je jeVar = new C1102je(this.f92265s);
        jeVar.mo13630b(this.f92254g);
        jeVar.mo13640e(this.f92248a);
        jeVar.mo13627a(true);
        jeVar.f22268t = true;
        if (!TextUtils.isEmpty(this.f92250c)) {
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(this.f92250c);
            jeVar.mo13626a(jdVar);
        }
        if (!TextUtils.isEmpty(this.f92249b)) {
            jeVar.mo13632b(this.f92249b);
        } else if (!TextUtils.isEmpty(this.f92250c)) {
            jeVar.mo13632b(this.f92250c);
        }
        PendingIntent pendingIntent = this.f92251d;
        if (pendingIntent == null) {
            Intent intent = new Intent();
            intent.setClassName(this.f92265s, this.f92255h);
            bogq bogq3 = this.f92253f;
            if (bogq3 != null && (i = bogq3.f133019h) > 0) {
                intent.putExtra("notification_type_key", i);
            }
            if (!TextUtils.isEmpty(this.f92256i)) {
                intent.setAction(this.f92256i);
            }
            if (!TextUtils.isEmpty(this.f92262o)) {
                intent.addCategory(this.f92262o);
            }
            Bundle bundle = this.f92261n;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            jeVar.f22254f = PendingIntent.getActivity(this.f92265s, 0, ConfirmUserCredentialAndStartChimeraActivity.m93423a(this.f92265s, intent), this.f92258k);
        } else {
            jeVar.f22254f = pendingIntent;
        }
        Bitmap bitmap = this.f92260m;
        if (bitmap != null) {
            jeVar.mo13621a(bitmap);
        }
        int i2 = this.f92259l;
        if (i2 != 0) {
            jeVar.f22271w = i2;
        }
        int i3 = this.f92266t;
        if (i3 != 0) {
            jeVar.f22258j = i3;
        }
        PendingIntent pendingIntent2 = this.f92252e;
        if (pendingIntent2 != null) {
            jeVar.mo13631b(pendingIntent2);
        }
        ArrayList arrayList = this.f92263p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            jeVar.mo13624a((C1099jb) arrayList.get(i4));
        }
        sex a2 = sex.m35104a(this.f92265s);
        if (TextUtils.isEmpty(this.f92257j)) {
            a2.mo25441a(this.f92264q, jeVar.mo13629b());
        } else {
            a2.mo25445a(this.f92257j, this.f92264q, jeVar.mo13629b());
        }
        aupo.m77578a(this.f92265s).edit().putLong(m77550a(this.f92253f), System.currentTimeMillis()).apply();
        return true;
    }

    /* renamed from: c */
    public final void mo50788c() {
        this.f92266t = 2;
    }

    /* renamed from: a */
    public static PendingIntent m77549a(Context context, bogq bogq, int i) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.trustagent.NotificationDismissedReceiver");
        intent.setAction("com.google.android.gms.trustagent.LOG_DELETE_NOTIFICATION");
        intent.putExtra("notification_type_key", bogq);
        return PendingIntent.getBroadcast(context.getApplicationContext(), i, intent, 0);
    }

    /* renamed from: a */
    private static String m77550a(bogq bogq) {
        int i = bogq != null ? bogq.f133019h : -1;
        StringBuilder sb = new StringBuilder(34);
        sb.append("last_notification_time_");
        sb.append(i);
        return sb.toString();
    }
}
