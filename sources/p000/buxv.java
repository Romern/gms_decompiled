package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: buxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buxv {

    /* renamed from: a */
    public final bvbu f155257a;

    /* renamed from: b */
    public final buwt f155258b;

    /* renamed from: c */
    public final SharedPreferences f155259c;

    /* renamed from: d */
    public final buwo f155260d;

    /* renamed from: e */
    public final bvdu f155261e = new buxi(this, "UserEnabledSettingSaved", new bvdu[0]);

    /* renamed from: f */
    public final bvdu f155262f = new buxj(this, "Disabled", this.f155261e);

    /* renamed from: g */
    public final bvdu f155263g = new buxk(this, "Enabled", this.f155261e);

    /* renamed from: h */
    public final bvdu f155264h = new buxl(this, "UserSettingsSaved", this.f155261e, this.f155263g);

    /* renamed from: i */
    public final bvdu f155265i = new buxn(this, "RevertedBackgroundScannerPiggybacking", new bvdu[0]);

    /* renamed from: j */
    final bvdu f155266j = new buxo(this, "Discovering", this.f155274r, this.f155261e, this.f155263g);

    /* renamed from: k */
    final bvdu f155267k = new buxp(this, "NotDiscovering", new bvdu[0]);

    /* renamed from: l */
    public final bvdu f155268l = new buxq(this, "Discoverable", this.f155264h, this.f155263g);

    /* renamed from: m */
    public final bvdu f155269m = new buxc(this, "RevertedDiscoverable", new bvdu[0]);

    /* renamed from: n */
    public final bvdu f155270n = new buxd(this, "StopBleUuidAndTokenAdvertiseState", new bvdu[0]);

    /* renamed from: o */
    public final bvdu f155271o = new buxe(this, "RevertedName", new bvdu[0]);

    /* renamed from: p */
    public final bvdu f155272p = new buxf(this, "RevertedEnabled", new bvdu[0]);

    /* renamed from: q */
    public final bvdu f155273q = new buxh(this, "Unmodified", this.f155269m, this.f155271o, this.f155275s, this.f155272p, this.f155265i);

    /* renamed from: r */
    private final bvdu f155274r = new buxm(this, "BackgroundScannerPiggybacking", new bvdu[0]);

    /* renamed from: s */
    private final bvdu f155275s = new buxg(this, "RemovedUserSettings", new bvdu[0]);

    public buxv(Context context, buwt buwt, SharedPreferences sharedPreferences, buwo buwo) {
        this.f155257a = (bvbu) ahgz.m55754a(context, bvbu.class);
        this.f155258b = buwt;
        this.f155259c = sharedPreferences;
        this.f155260d = buwo;
        if (sharedPreferences.contains("updated")) {
            long currentTimeMillis = System.currentTimeMillis() - this.f155259c.getLong("updated", 0);
            if (currentTimeMillis > 86400000) {
                long hours = TimeUnit.MILLISECONDS.toHours(currentTimeMillis);
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("buxv", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68415a("BluetoothStates: Very old original state file: %d h", hours);
            }
        }
    }

    /* renamed from: a */
    private final void m120734a() {
        if (this.f155259c.contains("updated")) {
            long currentTimeMillis = System.currentTimeMillis() - this.f155259c.getLong("updated", 0);
            if (currentTimeMillis > 86400000) {
                long hours = TimeUnit.MILLISECONDS.toHours(currentTimeMillis);
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68432a("buxv", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68415a("BluetoothStates: Very old original state file: %d h", hours);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo73240a(SharedPreferences.Editor editor, String str) {
        boolean commit = editor.putLong("updated", System.currentTimeMillis()).commit();
        if (commit) {
            srn srn = bvcm.f155598a;
        } else {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68432a("buxv", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("BluetoothStates: Failed to store to disk and %s", str);
        }
        return commit;
    }
}
