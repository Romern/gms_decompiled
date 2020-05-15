package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.TimeUnit;

/* renamed from: yqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqy implements yqo {

    /* renamed from: a */
    public static final yqy f54456a = new yqy();

    /* renamed from: b */
    private final bnic f54457b = bnic.m109489a(yqp.CYCLING_SPEED_AND_CADENCE.f54422d);

    /* renamed from: c */
    private final bnhe f54458c = bnhe.m109408a(yqj.CSC_MEASUREMENT.f54404j, yql.f54409e);

    /* renamed from: d */
    private final bnic f54459d = yqn.CYCLING_SPEED.f54417e;

    /* renamed from: e */
    private final bnhe f54460e = bnhe.m109408a(yql.f54409e, new yqg((int) cdzd.m135477f(), 2, cdzd.m135475d(), TimeUnit.SECONDS, cdzd.m135474c(), cdzd.m135473b()));

    static {
        zvt.m46581a();
    }

    private yqy() {
    }

    /* renamed from: a */
    public final cadn mo30672a(caae caae, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i;
        caaw caaw;
        caaw caaw2;
        caaw caaw3;
        caaw caaw4;
        bmxy.m108596a(this.f54458c.containsKey(bluetoothGattCharacteristic.getUuid()), "Characteristic with UUID not supported: %s", bluetoothGattCharacteristic.getUuid());
        caaw caaw5 = null;
        if (bluetoothGattCharacteristic.getValue().length == 0) {
            return null;
        }
        byte b = bluetoothGattCharacteristic.getValue()[0];
        if ((b & 1) != 0) {
            Integer intValue = bluetoothGattCharacteristic.getIntValue(20, 1);
            if (intValue != null) {
                caaw2 = yyp.m45047a(intValue.intValue());
            } else {
                caaw2 = null;
            }
            Integer intValue2 = bluetoothGattCharacteristic.getIntValue(18, 5);
            if (intValue2 != null) {
                caaw = yyp.m45047a(intValue2.intValue());
            } else {
                caaw = null;
            }
            i = 7;
        } else {
            caaw2 = null;
            caaw = null;
            i = 1;
        }
        if ((b & 2) != 0) {
            Integer intValue3 = bluetoothGattCharacteristic.getIntValue(18, i);
            int i2 = i + 2;
            if (intValue3 != null) {
                caaw4 = yyp.m45047a(intValue3.intValue());
            } else {
                caaw4 = null;
            }
            Integer intValue4 = bluetoothGattCharacteristic.getIntValue(18, i2);
            if (intValue4 != null) {
                caaw5 = yyp.m45047a(intValue4.intValue());
            }
            caaw3 = caaw5;
            caaw5 = caaw4;
        } else {
            caaw3 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        caaw[] caawArr = new caaw[4];
        if (caaw2 == null) {
            caaw2 = caaw.f172379i;
        }
        caawArr[0] = caaw2;
        if (caaw == null) {
            caaw = caaw.f172379i;
        }
        caawArr[1] = caaw;
        if (caaw5 == null) {
            caaw5 = caaw.f172379i;
        }
        caawArr[2] = caaw5;
        if (caaw3 == null) {
            caaw3 = caaw.f172379i;
        }
        caawArr[3] = caaw3;
        return yyk.m45014a(caae, currentTimeMillis, timeUnit, caawArr);
    }

    /* renamed from: b */
    public final bnic mo30675b() {
        return this.f54457b;
    }

    /* renamed from: c */
    public final bnhe mo30676c() {
        return this.f54458c;
    }

    /* renamed from: d */
    public final bnhe mo30677d() {
        return this.f54460e;
    }

    /* renamed from: e */
    public final bnic mo30678e() {
        return this.f54459d;
    }

    /* renamed from: f */
    public final bnic mo30679f() {
        return this.f54459d;
    }

    /* renamed from: a */
    public final String mo30673a() {
        return yqn.CYCLING_SPEED.f54416d;
    }

    /* renamed from: a */
    public final yqm mo30674a(caah caah) {
        bmxy.m108588a(this.f54459d.contains(caah));
        if (bzzn.m126363a(caah, bzzn.f172066F)) {
            return new yqw();
        }
        if (bzzn.m126363a(caah, bzzn.f172065E)) {
            return new yqt(yql.f54409e, bzzn.f172065E, yql.f54405a, bzzj.f172023ao);
        }
        if (bzzn.m126363a(caah, bzzn.f172063C)) {
            return new yqv();
        }
        if (bzzn.m126363a(caah, bzzn.f172064D)) {
            return new yqt(yql.f54409e, bzzn.f172064D, yql.f54407c, bzzj.f172023ao);
        }
        String valueOf = String.valueOf(caah.f172336b);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Derived sensor implementation not set for datatype: ") : "Derived sensor implementation not set for datatype: ".concat(valueOf));
    }
}
