package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import com.google.android.gms.nearby.discovery.fastpair.BistoPairingProgressHandler$2;
import java.io.ByteArrayOutputStream;

/* renamed from: ahtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahtn extends ahvo {

    /* renamed from: a */
    public boolean f68008a;

    /* renamed from: b */
    public final aacn f68009b = new BistoPairingProgressHandler$2(this, "bisto-setup");

    /* renamed from: f */
    private final buru f68010f;

    /* renamed from: g */
    private final ahvb f68011g;

    /* renamed from: h */
    private final ahtv f68012h;

    /* renamed from: i */
    private final boolean f68013i;

    /* renamed from: j */
    private String f68014j;

    public ahtn(Context context, ahsu ahsu, buru buru, ahvb ahvb, boolean z) {
        super(context, ahsu);
        this.f68010f = buru;
        this.f68011g = ahvb;
        this.f68013i = z;
        this.f68012h = (ahtv) ahgz.m55754a(context, ahtv.class);
    }

    /* renamed from: a */
    private final Intent m56628a(ahsu ahsu, String str) {
        Integer num;
        byte[] bArr = new byte[0];
        if (ahsu.mo37054A() != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ahsu.mo37054A().compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            double d = 0.75d;
            while (byteArrayOutputStream.size() > 500000) {
                Bitmap A = ahsu.mo37054A();
                double width = (double) ahsu.mo37054A().getWidth();
                double sqrt = Math.sqrt(d);
                Double.isNaN(width);
                double height = (double) ahsu.mo37054A().getHeight();
                double sqrt2 = Math.sqrt(d);
                Double.isNaN(height);
                Bitmap.createScaledBitmap(A, (int) (width * sqrt), (int) (height * sqrt2), true).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                d *= d;
            }
            bArr = byteArrayOutputStream.toByteArray();
        }
        Intent putExtra = new Intent().setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.apps.gsa.bisto.FAST_PAIR").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", bmxx.m108578b(this.f68014j)).putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", ahsu.mo37088m()).putExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME", ahsu.mo37086k()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", ahsu.mo37060G()).putExtra("com.google.android.gms.nearby.discovery.fastpair.PAIRING_STATE", str).putExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_IMAGE", sqd.m35972d(bArr));
        ahtv ahtv = this.f68012h;
        String m = ahsu.mo37088m();
        if (ahtv.f68034b.containsValue(m)) {
            num = (Integer) ahtv.f68034b.mo67382a().get(m);
        } else if (ahtv.f68034b.containsValue(m)) {
            num = (Integer) ahtv.f68034b.mo67382a().get(m);
        } else {
            Integer valueOf = Integer.valueOf(ahtv.f68033a.getAndIncrement());
            ahtv.f68034b.put(valueOf, m);
            num = valueOf;
        }
        return putExtra.putExtra("com.google.android.gms.nearby.discovery.CONNECTION_ID", num);
    }

    /* renamed from: b */
    public final bvjc mo37150b() {
        return bvjc.BISTO_PAIR_END;
    }

    /* renamed from: c */
    public final void mo37152c() {
        String str;
        super.mo37152c();
        ahvb ahvb = this.f68011g;
        ahvb.mo37191a(ahvb.f68142a);
        ahsu ahsu = this.f68174d;
        if (!this.f68013i) {
            str = "CONNECTING";
        } else {
            str = "RETROACTIVE_CONNECTING";
        }
        Intent a = m56628a(ahsu, str);
        this.f68173c.sendBroadcast(a);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BistoPairingProgressHandler: Sent pairing setup completed %s", a.toUri(1));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP");
        intentFilter.addAction("com.google.android.gms.nearby.discovery.ACTION_SUCCESS_BISTO_SETUP");
        this.f68173c.registerReceiver(this.f68009b, intentFilter);
        this.f68008a = true;
        ((buqh) ahgz.m55754a(this.f68173c, buqh.class)).mo72983a(new ahtm(this, "CancelBistoSetupReceiver"), cfog.f184854a.mo6606a().mo82019ba());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, boolean, java.lang.String, java.lang.String]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: b */
    public final void mo37151b(String str) {
        super.mo37151b(str);
        Intent a = m56628a(this.f68174d, "SUCCESS");
        this.f68173c.sendBroadcast(a);
        this.f68011g.mo37195a(true, this.f68013i, this.f68174d.mo37088m(), this.f68014j);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BistoPairingProgressHandler: Sent pairing success %s", a.toUri(1));
    }

    /* renamed from: a */
    public final bvjc mo37144a() {
        return bvjc.BISTO_PAIR_START;
    }

    /* renamed from: a */
    public final String mo37145a(aypk aypk, byte[] bArr, buru buru, String str) {
        if (this.f68013i) {
            return ahuy.m56683a(this.f68173c, aypk, this.f68174d, str);
        }
        return super.mo37145a(aypk, bArr, buru, str);
    }

    /* renamed from: a */
    public final void mo37146a(ayqi ayqi) {
        super.mo37146a(ayqi);
        if (this.f68013i) {
            ayqi.mo54256n(true);
            ayqi.mo54246i(cfoj.m141572v());
        }
    }

    /* renamed from: a */
    public final void mo37147a(String str) {
        String str2;
        super.mo37147a(str);
        this.f68014j = str;
        ahsu ahsu = this.f68174d;
        if (!this.f68013i) {
            str2 = "CONNECTING";
        } else {
            str2 = "RETROACTIVE_CONNECTING";
        }
        Intent a = m56628a(ahsu, str2);
        this.f68173c.sendBroadcast(a);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BistoPairingProgressHandler: Sent get bluetooth address %s", a.toUri(1));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, boolean, java.lang.String, java.lang.String]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: a */
    public final void mo37148a(Throwable th) {
        super.mo37148a(th);
        Intent a = m56628a(this.f68174d, "FAILED");
        this.f68173c.sendBroadcast(a);
        this.f68011g.mo37195a(false, this.f68013i, this.f68174d.mo37088m(), this.f68014j);
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("BistoPairingProgressHandler: Sent pairing failed %s", a.toUri(1));
    }

    /* renamed from: a */
    public final byte[] mo37149a(byte[] bArr, aypk aypk, aypj aypj) {
        byte[] a = super.mo37149a(bArr, aypk, aypj);
        if (a != null) {
            return a;
        }
        if (!this.f68013i || (a = aypj.mo54083a()) == null || this.f68010f.mo73068d() == null) {
            return a;
        }
        this.f68011g.mo37194a(this.f68010f.mo73068d().name, aypk.mo54196b(a));
        return a;
    }
}
