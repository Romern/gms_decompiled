package com.google.android.gms.ads.config;

import android.os.Environment;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.ads.config.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0233b {

    /* renamed from: b */
    private static final String f7943b = String.valueOf(Environment.getExternalStorageDirectory().getPath()).concat("/flags_override.cert");

    /* renamed from: a */
    public ArrayList f7944a;

    public C0233b() {
        ArrayList arrayList;
        try {
            File file = new File(f7943b);
            if (file.isFile() && file.canRead()) {
                arrayList = new ArrayList();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                }
                bufferedReader.close();
            } else {
                arrayList = new ArrayList();
            }
            this.f7944a = arrayList;
        } catch (IOException e) {
            this.f7944a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo6441a() {
        ArrayList arrayList = this.f7944a;
        if (arrayList == null || arrayList.size() < 2) {
            return null;
        }
        return this.f7944a.subList(0, this.f7944a.size() - 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Date mo6442b() {
        ArrayList arrayList = this.f7944a;
        if (arrayList == null || arrayList.size() < 2) {
            return null;
        }
        String str = (String) this.f7944a.get(this.f7944a.size() - 2);
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(str);
        } catch (ParseException e) {
            String valueOf = String.valueOf(str);
            C0633h.m5668b(valueOf.length() == 0 ? new String("Malformed flag override expiration date: ") : "Malformed flag override expiration date: ".concat(valueOf));
            return null;
        }
    }
}
