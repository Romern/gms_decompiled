package p000;

import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iiu {
    /* renamed from: a */
    static List m15491a(byte[] bArr) {
        if (bArr == null) {
            return new ArrayList();
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                ihg ihg = new ihg();
                ihg.f21019a = objectInputStream.readUTF();
                ihg.f21022d.add(2);
                ihg.f21021c = objectInputStream.readLong();
                ihg.f21022d.add(4);
                ihg.f21020b = objectInputStream.readLong();
                ihg.f21022d.add(3);
                arrayList.add(new BeaconSeedEntity(ihg.f21022d, ihg.f21019a, ihg.f21020b, ihg.f21021c));
            } catch (EOFException e) {
                objectInputStream.close();
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m15492a(List list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ihh ihh = (ihh) list.get(i);
            new ByteArrayOutputStream();
            objectOutputStream.writeUTF(ihh.mo7555b());
            objectOutputStream.writeLong(ihh.mo7558d());
            objectOutputStream.writeLong(ihh.mo7557c());
        }
        objectOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
