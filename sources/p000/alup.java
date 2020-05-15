package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: alup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alup implements alua {

    /* renamed from: a */
    List f74319a = new ArrayList();

    /* renamed from: b */
    String f74320b;

    public alup(String str, List list) {
        this.f74320b = str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f74319a.add(bxtx.m123258a(String.valueOf((String) list.get(i)).concat("\n")));
        }
    }

    /* renamed from: a */
    public final int mo40779a() {
        List list = this.f74319a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((bxtx) list.get(i2)).mo73744a();
        }
        return i;
    }

    /* renamed from: b */
    public final String mo40781b() {
        return this.f74320b;
    }

    /* renamed from: a */
    public final byte[] mo40780a(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        List list = this.f74319a;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            bxtx bxtx = (bxtx) list.get(i2);
            if (i != Integer.MAX_VALUE && i < bxtx.mo73744a() + i3) {
                break;
            }
            try {
                bxtx.mo73757a(byteArrayOutputStream);
                i3 += bxtx.mo73744a();
                i2++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public final Map mo40782c() {
        return bnoj.f131912b;
    }
}
