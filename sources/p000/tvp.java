package p000;

import android.content.Context;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvp implements InputManager.InputDeviceListener {

    /* renamed from: c */
    public static final /* synthetic */ int f46729c = 0;

    /* renamed from: d */
    private static final int[] f46730d = tvr.m37535a((String) tvr.f46741d.mo25081c());

    /* renamed from: e */
    private static final int[] f46731e = tvr.m37535a((String) tvr.f46742e.mo25081c());

    /* renamed from: a */
    public final tvo f46732a;

    /* renamed from: b */
    public final InputManager f46733b;

    /* renamed from: f */
    private final Context f46734f;

    /* renamed from: g */
    private final tvq f46735g;

    public tvp(tvo tvo, Context context) {
        this.f46732a = tvo;
        this.f46734f = context;
        InputManager inputManager = (InputManager) context.getSystemService("input");
        this.f46733b = inputManager;
        inputManager.getInputDevice(0);
        this.f46733b.registerInputDeviceListener(this, null);
        tvq tvq = new tvq(this);
        this.f46735g = tvq;
        tvq.run();
    }

    /* renamed from: a */
    private static final int m37529a(InputDevice inputDevice, int... iArr) {
        boolean[] zArr;
        if (iArr == null || iArr.length == 0) {
            zArr = new boolean[]{false};
        } else {
            int i = Build.VERSION.SDK_INT;
            zArr = inputDevice.hasKeys(iArr);
        }
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (!zArr[i2]) {
                return i2;
            }
        }
        return iArr.length;
    }

    /* renamed from: b */
    private static final SparseIntArray m37531b(InputDevice inputDevice) {
        List<InputDevice.MotionRange> motionRanges = inputDevice.getMotionRanges();
        SparseIntArray sparseIntArray = new SparseIntArray(motionRanges.size());
        int size = motionRanges.size();
        for (int i = 0; i < size; i++) {
            InputDevice.MotionRange motionRange = motionRanges.get(i);
            sparseIntArray.put(motionRange.getAxis(), motionRange.getSource());
        }
        return sparseIntArray;
    }

    /* renamed from: c */
    private static final boolean m37532c(InputDevice inputDevice) {
        if (m37529a(inputDevice, f46730d) == f46730d.length) {
            return true;
        }
        SparseIntArray b = m37531b(inputDevice);
        if (b.indexOfKey(15) < 0 || b.indexOfKey(16) < 0) {
            return false;
        }
        return true;
    }

    public final void onInputDeviceAdded(int i) {
        InputDevice inputDevice = this.f46733b.getInputDevice(i);
        if (inputDevice != null) {
            this.f46732a.mo26823a(mo26825a(inputDevice));
            Intent intent = new Intent("com.google.android.gms.deviceconnection.input_device_connected");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("input_device_id", i);
            this.f46734f.sendBroadcast(intent);
        }
    }

    public final void onInputDeviceChanged(int i) {
        InputDevice inputDevice = this.f46733b.getInputDevice(i);
        if (inputDevice != null) {
            this.f46732a.mo26823a(mo26825a(inputDevice));
        }
    }

    public final void onInputDeviceRemoved(int i) {
        Intent intent = new Intent("com.google.android.gms.deviceconnection.input_device_disconnected");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("input_device_id", i);
        this.f46734f.sendBroadcast(intent);
    }

    /* renamed from: a */
    private static final boolean m37530a(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i;
    }

    /* renamed from: a */
    public final String[] mo26825a(InputDevice inputDevice) {
        ArrayList arrayList = new ArrayList();
        if (m37532c(inputDevice)) {
            arrayList.add("android.hardware.dpad");
        }
        if (m37530a(inputDevice, 65540)) {
            arrayList.add("android.hardware.trackball");
        }
        if (m37530a(inputDevice, 1048584)) {
            arrayList.add("android.hardware.touchpad");
        }
        if (m37532c(inputDevice) && m37529a(inputDevice, f46731e) >= f46731e.length) {
            SparseIntArray b = m37531b(inputDevice);
            if ((b.get(22) == 16777232 || b.get(18) == 16777232) && ((b.get(23) == 16777232 || b.get(17) == 16777232) && b.get(0) == 16777232 && b.get(1) == 16777232 && b.get(11) == 16777232 && b.get(14) == 16777232)) {
                arrayList.add("android.hardware.gamepad");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
