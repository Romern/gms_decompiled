package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.TimeUnit;

/* renamed from: yqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yqz implements yqo {

    /* renamed from: a */
    public static final yqz f54461a = new yqz();

    /* renamed from: b */
    private final bnic f54462b = bnic.m109489a(yqp.HEART_RATE.f54422d);

    /* renamed from: c */
    private final bnhe f54463c = bnhe.m109408a(yqj.HEART_RATE_MEASUREMENT.f54404j, bzzn.f172073M);

    /* renamed from: d */
    private final bnic f54464d = bnon.f131923a;

    /* renamed from: e */
    private final bnhe f54465e = bnhe.m109408a(bzzn.f172073M, new yqg((int) cdzd.m135477f(), 1, cdzd.m135475d(), TimeUnit.SECONDS, cdzd.m135474c(), cdzd.m135473b()));

    /* renamed from: f */
    private final bnic f54466f = yqn.HEART_RATE_MONITOR.f54417e;

    static {
        zvt.m46581a();
    }

    private yqz() {
    }

    /* renamed from: a */
    public final cadn mo30672a(caae caae, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i;
        bmxy.m108596a(this.f54463c.containsKey(bluetoothGattCharacteristic.getUuid()), "Characteristic with UUID not supported: %s", bluetoothGattCharacteristic.getUuid());
        if (bluetoothGattCharacteristic.getValue().length != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if ((bluetoothGattCharacteristic.getValue()[0] & 1) == 0) {
                i = 17;
            } else {
                i = 18;
            }
            Integer intValue = bluetoothGattCharacteristic.getIntValue(i, 1);
            if (!(intValue == null || intValue.intValue() == 0)) {
                return yyk.m45012a(caae, currentTimeMillis, TimeUnit.MILLISECONDS, (double) intValue.floatValue());
            }
        }
        return null;
    }

    /* renamed from: b */
    public final bnic mo30675b() {
        return this.f54462b;
    }

    /* renamed from: c */
    public final bnhe mo30676c() {
        return this.f54463c;
    }

    /* renamed from: d */
    public final bnhe mo30677d() {
        return this.f54465e;
    }

    /* renamed from: e */
    public final bnic mo30678e() {
        return this.f54464d;
    }

    /* renamed from: f */
    public final bnic mo30679f() {
        return this.f54466f;
    }

    /* renamed from: a */
    public final String mo30673a() {
        return yqn.HEART_RATE_MONITOR.f54416d;
    }

    /* renamed from: a */
    public final yqm mo30674a(caah caah) {
        throw new UnsupportedOperationException("This sensor has no derived types");
    }
}
