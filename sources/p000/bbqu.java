package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: bbqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqu {
    /* renamed from: a */
    public static Bitmap m88419a(byte[] bArr) {
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception e) {
            bbos.m88292b("SerializeUtil", "failed to deserialize bitmap", e);
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap m88424b(byte[] bArr) {
        try {
            Object e = m88427e(bArr);
            return !(e instanceof HashMap) ? new HashMap() : (HashMap) e;
        } catch (IOException | ClassNotFoundException e2) {
            bbos.m88292b("SerializeUtil", "Error reading properties.", e2);
            bbos.m88289a("SerializeUtil", String.format("Error reading properties with contents: %s", new String(bArr)));
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static HashMap m88425c(byte[] bArr) {
        try {
            Object e = m88427e(bArr);
            if (e instanceof HashMap) {
                for (byte[] bArr2 : ((HashMap) e).values()) {
                }
                return (HashMap) e;
            }
        } catch (IOException | ClassCastException | ClassNotFoundException e2) {
            bbos.m88292b("SerializeUtil", "Error reading property bytes.", e2);
            bbos.m88289a("SerializeUtil", String.format("Error reading property bytes with contents: %s", new String(bArr)));
        }
        return new HashMap();
    }

    /* renamed from: d */
    public static String m88426d(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: e */
    private static Object m88427e(byte[] bArr) {
        return new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
    }

    /* renamed from: a */
    public static bmxv m88420a(Object obj) {
        try {
            return bmxv.m108566b((HashMap) obj);
        } catch (ClassCastException e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static byte[] m88421a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m88422a(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public static byte[] m88423a(String str) {
        return Base64.decode(str, 2);
    }
}
