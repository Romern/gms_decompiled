package p000;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.nearby.bootstrap.Device;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ahcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahcn extends ahdb {

    /* renamed from: a */
    public static final bnsp f66999a = bnsp.m110328a("NearbyBootstrap");

    /* renamed from: v */
    private final BluetoothAdapter f67000v;

    /* renamed from: w */
    private final int f67001w;

    /* renamed from: x */
    private final String f67002x;

    /* renamed from: y */
    private final ahcm f67003y = new ahcm(this);

    public ahcn(buye buye, buqb buqb, BluetoothAdapter bluetoothAdapter, String str, String str2, byte b, ahdj ahdj, ahdm ahdm, ahcs ahcs) {
        super(buye, buqb, str, str2, b, ahdj, ahdm, ahcs);
        this.f67000v = bluetoothAdapter;
        this.f67001w = bluetoothAdapter.getScanMode();
        this.f67002x = bluetoothAdapter.getName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Device mo36291a(buyn buyn) {
        if ((buyn.f155318a & 2) == 0) {
            return null;
        }
        buzt buzt = buyn.f155320c;
        if (buzt == null) {
            buzt = buzt.f155423f;
        }
        int a = buzz.m120822a(buzt.f155426b);
        if ((a != 0 && a != 1) || (buyn.f155318a & 4) == 0) {
            return null;
        }
        buzw buzw = buyn.f155321d;
        if (buzw == null) {
            buzw = buzw.f155438d;
        }
        String str = buzw.f155442c;
        String a2 = ahcj.m55462a(str);
        String b = ahcj.m55465b(str);
        buzw buzw2 = buyn.f155321d;
        if (buzw2 == null) {
            buzw2 = buzw.f155438d;
        }
        return new Device(a2, b, ahcj.m55464a(buzw2.f155441b.mo73780k()), ahcj.m55466c(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final buym mo36293b() {
        bxvd da = buym.f155312c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buym buym = (buym) da.f164949b;
        buym.f155315b = 1;
        buym.f155314a = 1 | buym.f155314a;
        return (buym) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo36294c() {
        boolean z;
        this.f67003y.mo36300b();
        if (!mo36301a(this.f67001w)) {
            bnsl bnsl = (bnsl) f66999a.mo68388c();
            bnsl.mo68432a("ahcn", "c", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothTargetDevice: fail to revert bluetooth scan mode");
        }
        String str = this.f67002x;
        if (str == null) {
            z = this.f67000v.setName(Build.MODEL);
        } else {
            z = this.f67000v.setName(str);
        }
        if (!z) {
            bnsl bnsl2 = (bnsl) f66999a.mo68387b();
            bnsl2.mo68432a("ahcn", "c", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("BluetoothTargetDevice: unable to reset device name.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo36292a() {
        BluetoothAdapter bluetoothAdapter = this.f67000v;
        String str = this.f67030l;
        String str2 = this.f67031m;
        byte b = this.f67032n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("]");
        sb.append((char) (b + 48));
        sb.append(str2);
        bluetoothAdapter.setName(sb.toString());
        if (!mo36301a(23)) {
            bnsl bnsl = (bnsl) f66999a.mo68388c();
            bnsl.mo68432a("ahcn", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("BluetoothTargetDevice: fail to start discoverable mode on BT Adapter");
            return false;
        } else if (!cfns.f184620a.mo6606a().mo81711a()) {
            return true;
        } else {
            this.f67003y.mo36299a();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo36301a(int i) {
        try {
            return ((Boolean) BluetoothAdapter.class.getMethod("setScanMode", Integer.TYPE).invoke(this.f67000v, Integer.valueOf(i))).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            bnsl bnsl = (bnsl) f66999a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahcn", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("BluetoothTargetDevice: Fail to call hidden api BluetoothAdapter.setScanMode(%s)", i);
            return false;
        }
    }
}
