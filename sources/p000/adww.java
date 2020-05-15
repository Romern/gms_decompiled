package p000;

import android.accounts.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: adww */
public final /* synthetic */ class adww implements bbjo {

    /* renamed from: a */
    public static final bbjo f62852a = new adww();

    private adww() {
    }

    /* renamed from: a */
    public final bqgg mo14476a() {
        ArrayList arrayList = new ArrayList();
        try {
            adxl.m51314a();
            adxl.m51325c();
        } catch (IOException e) {
            arrayList.add(e);
        }
        try {
            advl.m51241a(Arrays.asList((Account[]) adwg.m51268a().mo66812a(new Account[0]))).mo60669b();
        } catch (IOException e2) {
            arrayList.add(e2);
        }
        if (arrayList.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        throw adwk.m51281a("Exception in the wipeout task", arrayList);
    }
}
