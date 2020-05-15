package p000;

import android.content.Context;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: nbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbr {

    /* renamed from: a */
    public static final lvn f35208a = new lvn("TertiaryKeyRotationWindowedCount");

    /* renamed from: b */
    public final File f35209b;

    /* renamed from: c */
    public ArrayList f35210c = new ArrayList();

    public nbr(File file) {
        this.f35209b = file;
        try {
            m25899b();
        } catch (IOException e) {
            f35208a.mo25417e("Error reading tertiary_key_rotation_windowed_count", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static nbr m25898a(Context context) {
        return new nbr(new File(context.getFilesDir(), "tertiary_key_rotation_windowed_count"));
    }

    /* renamed from: b */
    private final void m25899b() {
        DataInputStream dataInputStream;
        if (this.f35209b.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.f35209b);
                try {
                    dataInputStream = new DataInputStream(fileInputStream);
                    while (true) {
                        this.f35210c.add(Long.valueOf(dataInputStream.readLong()));
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (EOFException e) {
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo20440a() {
        long currentTimeMillis = (System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24)) + 1;
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f35210c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList2.get(i)).longValue();
            if (longValue >= currentTimeMillis && longValue <= currentTimeMillis2) {
                arrayList.add(Long.valueOf(longValue));
            }
        }
        this.f35210c = arrayList;
    }
}
