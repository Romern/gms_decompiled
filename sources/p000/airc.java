package p000;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: airc */
final /* synthetic */ class airc implements Runnable {

    /* renamed from: a */
    private final airi f69536a;

    /* renamed from: b */
    private final InputStream f69537b;

    public airc(airi airi, InputStream inputStream) {
        this.f69536a = airi;
        this.f69537b = inputStream;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    public final void run() {
        airi airi = this.f69536a;
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.f69537b));
            while (true) {
                int readInt = dataInputStream.readInt();
                int i = aips.f69458d;
                if (readInt > 3) {
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    airi.mo37894b(bArr);
                } else {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                    bnsl.mo68432a("airi", "b", 421, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68413a("PhysicalBleSocket get invalid BlePacket length(%s) from %s", readInt, (Object) airi.f69543a);
                    airi.f69545c.mo37590a();
                    return;
                }
            }
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("airi", "b", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("PhysicalBleSocket failed to read BlePacket from %s on L2CAP", airi.f69543a);
            airi.f69545c.mo37590a();
        }
    }
}
