package p000;

import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: bjye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjye {
    /* renamed from: a */
    public static final String m104885a(String str) {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append(valueOf);
        sb.append("/wallet_uitests/payse_response/");
        String valueOf2 = String.valueOf(sb.toString());
        try {
            return new String(bobi.m111041b(new File(str.length() == 0 ? new String(valueOf2) : valueOf2.concat(str))), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Error reading replay result", e);
        }
    }
}
