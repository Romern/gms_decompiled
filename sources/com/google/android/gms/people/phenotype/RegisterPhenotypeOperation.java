package com.google.android.gms.people.phenotype;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RegisterPhenotypeOperation extends IntentOperation {
    /* renamed from: a */
    public static int m68069a(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra("first_sdk_extra")) {
            return amih.m62940a(context);
        }
        return intent.getIntExtra("first_sdk_extra", -1);
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        byte[] bArr;
        if (intent.hasExtra("mendel_package_name")) {
            str = stm.m36299a(intent.getStringExtra("mendel_package_name"));
        } else {
            str = "com.google.android.gms.people";
        }
        aney a = anef.m64089a(this);
        int b = stu.m36316b();
        String[] strArr = {"GMS_CORE_PEOPLE", "CHIPS"};
        if (!str.equals("com.google.android.gms.people.ui")) {
            bxvd da = alkr.f73594c.mo74144da();
            int a2 = m68069a(this, intent);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            alkr alkr = (alkr) da.f164949b;
            alkr.f73596a = 1 | alkr.f73596a;
            alkr.f73597b = a2;
            bArr = ((alkr) da.mo74062i()).mo73642k();
        } else {
            bArr = null;
        }
        aucb a3 = a.mo25234a(str, b, strArr, bArr);
        a3.mo50378a(Executors.newCachedThreadPool(), new amii(this, this, str, intent));
        try {
            aucu.m76783a(a3, 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("PeopleGmsPhenoRgstrIntentOp", "Google Api connection failed");
        }
    }
}
