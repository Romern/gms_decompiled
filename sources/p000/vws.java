package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* renamed from: vws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vws {

    /* renamed from: a */
    private static final String f50162a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ():[];/.-";

    /* renamed from: b */
    private char[] f50163b;

    public vws(String str) {
        Random random = new Random((long) str.hashCode());
        String valueOf = String.valueOf(f50162a);
        String valueOf2 = String.valueOf(str);
        this.f50163b = (valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)).toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char c : this.f50163b) {
            arrayList.add(Character.valueOf(c));
        }
        Collections.shuffle(arrayList, random);
        for (int i = 0; i < arrayList.size(); i++) {
            this.f50163b[i] = ((Character) arrayList.get(i)).charValue();
        }
    }

    /* renamed from: a */
    public final String mo28917a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            if (i >= 0) {
                char[] cArr = this.f50163b;
                if (i < cArr.length) {
                    sb.append(cArr[i]);
                }
            }
        }
        return sb.toString();
    }
}
