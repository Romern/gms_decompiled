package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.TimeUnit;

/* renamed from: yra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yra implements yqo {

    /* renamed from: a */
    public static final yra f54467a = new yra();

    /* renamed from: b */
    private final bnic f54468b = bnic.m109489a(yqp.RUNNING_SPEED_AND_CADENCE.f54422d);

    /* renamed from: c */
    private final bnhe f54469c = bnhe.m109408a(yqj.RSC_MEASUREMENT.f54404j, yql.f54411g);

    /* renamed from: d */
    private final bnic f54470d = yqn.RUNNING_SPEED.f54417e;

    /* renamed from: e */
    private final bnhe f54471e = bnhe.m109408a(yql.f54411g, new yqg((int) cdzd.m135477f(), 2, cdzd.m135475d(), TimeUnit.SECONDS, cdzd.m135474c(), cdzd.m135473b()));

    static {
        zvt.m46581a();
    }

    private yra() {
    }

    /* renamed from: a */
    public final cadn mo30672a(caae caae, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        caaw caaw;
        caaw caaw2;
        caaw caaw3;
        Integer intValue;
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
        bmxy.m108596a(this.f54469c.containsKey(bluetoothGattCharacteristic.getUuid()), "Characteristic with UUID not supported: %s", bluetoothGattCharacteristic.getUuid());
        caaw caaw4 = null;
        if (bluetoothGattCharacteristic.getValue().length == 0) {
            return null;
        }
        byte b = bluetoothGattCharacteristic.getValue()[0];
        caaw a = yyp.m45047a((b & 4) == 0 ? 7 : 8);
        Integer intValue2 = bluetoothGattCharacteristic2.getIntValue(18, 1);
        if (intValue2 != null) {
            caaw = yyp.m45046a((double) (((float) intValue2.intValue()) / 256.0f));
        } else {
            caaw = null;
        }
        Integer intValue3 = bluetoothGattCharacteristic2.getIntValue(17, 3);
        if (intValue3 != null) {
            caaw2 = yyp.m45046a((double) intValue3.floatValue());
        } else {
            caaw2 = null;
        }
        int i = 6;
        if ((b & 1) != 0) {
            Integer intValue4 = bluetoothGattCharacteristic2.getIntValue(18, 4);
            caaw3 = intValue4 != null ? yyp.m45046a((double) (((float) intValue4.intValue()) / 100.0f)) : null;
        } else {
            caaw3 = null;
            i = 4;
        }
        if (!((b & 2) == 0 || (intValue = bluetoothGattCharacteristic2.getIntValue(20, i)) == null)) {
            caaw4 = yyp.m45046a((double) (((float) bqcx.m112609a(intValue.intValue())) / 10.0f));
        }
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        caaw[] caawArr = new caaw[5];
        if (caaw == null) {
            caaw = caaw.f172379i;
        }
        caawArr[0] = caaw;
        if (caaw2 == null) {
            caaw2 = caaw.f172379i;
        }
        caawArr[1] = caaw2;
        if (caaw3 == null) {
            caaw3 = caaw.f172379i;
        }
        caawArr[2] = caaw3;
        if (caaw4 == null) {
            caaw4 = caaw.f172379i;
        }
        caawArr[3] = caaw4;
        caawArr[4] = a;
        return yyk.m45014a(caae, currentTimeMillis, timeUnit, caawArr);
    }

    /* renamed from: b */
    public final bnic mo30675b() {
        return this.f54468b;
    }

    /* renamed from: c */
    public final bnhe mo30676c() {
        return this.f54469c;
    }

    /* renamed from: d */
    public final bnhe mo30677d() {
        return this.f54471e;
    }

    /* renamed from: e */
    public final bnic mo30678e() {
        return this.f54470d;
    }

    /* renamed from: f */
    public final bnic mo30679f() {
        return this.f54470d;
    }

    /* renamed from: a */
    public final String mo30673a() {
        return yqn.RUNNING_SPEED.f54416d;
    }

    /* renamed from: a */
    public final yqm mo30674a(caah caah) {
        bmxy.m108588a(this.f54470d.contains(caah));
        if (bzzn.m126363a(caah, bzzn.f172098ak)) {
            return new yqu(yql.f54411g, bzzn.f172098ak, bzzj.f172028at);
        }
        if (bzzn.m126363a(caah, bzzn.f172100am)) {
            return new yqu(yql.f54411g, bzzn.f172100am, bzzj.f172024ap);
        }
        if (bzzn.m126363a(caah, bzzn.f172102ao)) {
            return new yqs();
        }
        String valueOf = String.valueOf(caah.f172336b);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Derived sensor implementation not set for datatype: ") : "Derived sensor implementation not set for datatype: ".concat(valueOf));
    }
}
