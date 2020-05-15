package p000;

import com.google.android.gms.auth.proximity.gencode.server.api.ExternalDeviceInfoEntity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jts {
    /* renamed from: a */
    static List m17319a(byte[] bArr) {
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                arrayList.add(m17320a(bArr, objectInputStream));
            } catch (EOFException e) {
                objectInputStream.close();
                return arrayList;
            } catch (Throwable th) {
                objectInputStream.close();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static jrn m17320a(byte[] bArr, ObjectInputStream objectInputStream) {
        boolean z;
        if (objectInputStream == null) {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            z = true;
        } else {
            z = false;
        }
        ExternalDeviceInfoEntity externalDeviceInfoEntity = new ExternalDeviceInfoEntity();
        try {
            new sja().mo25626a(objectInputStream.readUTF(), externalDeviceInfoEntity);
            if (z) {
                objectInputStream.close();
            }
            return externalDeviceInfoEntity;
        } catch (Throwable th) {
            if (z) {
                objectInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m17321a(jrn jrn, ObjectOutputStream objectOutputStream) {
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (objectOutputStream == null) {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            z = true;
        } else {
            z = false;
        }
        try {
            jrn.mo7556bF();
            objectOutputStream.writeUTF(jrn.toString());
            if (!z) {
                return null;
            }
            objectOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            if (z) {
                objectOutputStream.close();
            }
            throw th;
        }
    }
}
