package p000;

import android.os.ParcelFileDescriptor;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lst {
    /* renamed from: a */
    public static List m24353a(ParcelFileDescriptor parcelFileDescriptor) {
        ArrayList arrayList = new ArrayList();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(parcelFileDescriptor.getFileDescriptor())));
        while (true) {
            try {
                String readUTF = dataInputStream.readUTF();
                int readInt = dataInputStream.readInt();
                int max = Math.max(readInt, 0);
                byte[] bArr = new byte[max];
                dataInputStream.read(bArr, 0, max);
                arrayList.add(lsu.m24355a(readUTF, readInt, bArr));
            } catch (EOFException e) {
                dataInputStream.close();
                return arrayList;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        throw th;
    }

    /* renamed from: a */
    public static void m24354a(lsu lsu, ParcelFileDescriptor parcelFileDescriptor) {
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor())));
        try {
            dataOutputStream.writeUTF(((lsg) lsu).f32835a);
            dataOutputStream.writeInt(((lsg) lsu).f32836b);
            dataOutputStream.write(bqce.m112561a(((lsg) lsu).f32837c), 0, Math.max(((lsg) lsu).f32836b, 0));
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
