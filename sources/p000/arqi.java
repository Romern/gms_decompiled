package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: arqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqi {
    /* renamed from: a */
    public static int m73306a(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public static ArrayList m73307a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            UserCredential userCredential = (UserCredential) list.get(i);
            Bundle bundle = new Bundle();
            bundle.putString("name", userCredential.f108179b);
            if (TextUtils.isEmpty(userCredential.f108182e)) {
                bundle.putString("credential", userCredential.f108183f);
            } else {
                bundle.putString("url", userCredential.f108182e);
            }
            if (!TextUtils.isEmpty(userCredential.f108184g)) {
                bundle.putString("firstName", userCredential.f108184g);
            }
            if (!TextUtils.isEmpty(userCredential.f108185h)) {
                bundle.putString("lastName", userCredential.f108185h);
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m73308a(UserCredential[] userCredentialArr) {
        return m73307a(new ArrayList(Arrays.asList(userCredentialArr)));
    }
}
