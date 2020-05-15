package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.credit.base.CreditCardResult;
import com.google.android.gms.ocr.credit.base.DeviceAccountName;
import com.google.android.gms.ocr.credit.base.ExpDateResult;
import com.google.android.gms.ocr.credit.base.GenericResult;
import com.google.android.gms.ocr.credit.base.NameResult;
import com.google.android.gms.ocr.credit.base.PanResult;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: aksq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksq {
    /* renamed from: a */
    public static Bundle m60378a(akua akua) {
        Bundle bundle = new Bundle();
        if (akua != null) {
            bundle.putBoolean("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", akua.f72821c);
            bundle.putBoolean("com.google.android.gms.ocr.NAME_RECOGNITION_ENABLED", akua.f72822d);
        }
        return bundle;
    }

    /* renamed from: b */
    public static Intent m60383b(akua akua) {
        return new Intent().putExtras(m60378a(akua));
    }

    /* renamed from: a */
    public static CreditCardOcrResult m60379a(int i, int i2) {
        akpa b = CreditCardOcrResult.m67676b();
        b.mo39635d(i);
        b.mo39630a(i2);
        return b.f72380a;
    }

    /* renamed from: a */
    public static CreditCardOcrResult m60380a(CreditCardResult creditCardResult) {
        String str;
        int i;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        PanResult panResult = creditCardResult.f81285a;
        String str7 = null;
        if (panResult != null) {
            str = panResult.f81303e;
        } else {
            str = null;
        }
        ExpDateResult expDateResult = creditCardResult.f81287c;
        int i2 = -1;
        if (expDateResult != null) {
            i2 = expDateResult.mo44727a();
            i = (creditCardResult.f81287c.mo44728b() % 100) + 2000;
        } else {
            i = -1;
        }
        NameResult nameResult = creditCardResult.f81289e;
        int i3 = 0;
        if (nameResult != null) {
            String str8 = nameResult.f81303e;
            str4 = nameResult.f81304a;
            z = nameResult.f81305b;
            DeviceAccountName deviceAccountName = nameResult.f81307g;
            if (deviceAccountName != null) {
                String b = stm.m36300b(deviceAccountName.f81293a);
                str3 = stm.m36300b(deviceAccountName.f81294b);
                str2 = stm.m36300b(deviceAccountName.f81295c);
                String b2 = stm.m36300b(deviceAccountName.f81296d);
                str6 = b;
                str7 = str8;
                str5 = b2;
            } else {
                str6 = null;
                str3 = null;
                str2 = null;
                str7 = str8;
                str5 = null;
            }
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            z = false;
        }
        Integer num = creditCardResult.f81292h;
        if (num != null) {
            i3 = num.intValue();
        }
        akpa b3 = CreditCardOcrResult.m67676b();
        b3.mo39633b(str);
        b3.mo39632b(i2);
        b3.mo39634c(i);
        b3.f72380a.f81231d = i3;
        b3.mo39631a(str7);
        CreditCardOcrResult creditCardOcrResult = b3.f72380a;
        creditCardOcrResult.f81233f = str4;
        creditCardOcrResult.f81234g = z;
        creditCardOcrResult.f81235h = str6;
        creditCardOcrResult.f81236i = str3;
        creditCardOcrResult.f81237j = str2;
        creditCardOcrResult.f81238k = str5;
        b3.f72380a.f81239l = creditCardResult.mo44720c();
        b3.f72380a.f81240m = creditCardResult.mo44721d();
        b3.f72380a.f81241n = creditCardResult.mo44719b();
        String[] a = creditCardResult.mo44718a();
        CreditCardOcrResult creditCardOcrResult2 = b3.f72380a;
        creditCardOcrResult2.f81242o = a;
        return creditCardOcrResult2;
    }

    /* renamed from: a */
    public static void m60381a(GenericResult genericResult, ArrayList arrayList) {
        if (genericResult != null) {
            int size = arrayList.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                if (((GenericResult) arrayList.get(i)).f81303e.equals(genericResult.f81303e)) {
                    GenericResult genericResult2 = (GenericResult) arrayList.get(i);
                    genericResult2.f81302d = genericResult.mo44733d();
                    genericResult2.f81301c++;
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(genericResult);
            }
        }
    }

    /* renamed from: a */
    public static String[] m60382a(ArrayList arrayList) {
        String[] strArr = new String[0];
        if (arrayList != null) {
            strArr = new String[arrayList.size()];
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            strArr[i] = ((GenericResult) arrayList.get(i)).f81303e;
        }
        return strArr;
    }
}
