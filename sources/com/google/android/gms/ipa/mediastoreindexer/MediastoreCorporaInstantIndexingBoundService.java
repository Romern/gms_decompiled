package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import android.database.Cursor;
import android.os.IBinder;
import android.provider.MediaStore;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediastoreCorporaInstantIndexingBoundService extends BoundService {
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (ceqm.m137878i()) {
            printWriter.println("Media store indexer:");
            printWriter.format("DB version: %d\n", 3);
            adrq adrq = new adrq(getContentResolver(), null);
            adro a = adrp.m51071a();
            a.f62578f = 1;
            a.f62573a = 0L;
            a.f62575c = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            a.f62576d = new String[]{"_id"};
            Cursor a2 = adrq.mo33749a(a.mo33748a());
            if (a2 != null) {
                try {
                    printWriter.format("Image media source size: %d\n", Integer.valueOf(a2.getCount()));
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            if (a2 != null) {
                a2.close();
            }
            Cursor a3 = new adsi(adsj.m51086a(this)).mo33758a();
            try {
                printWriter.format("Intermediate store size: %d\n", Integer.valueOf(a3.getCount()));
                if (a3 != null) {
                    a3.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            printWriter.println("Mediastore indexer not enabled.");
            return;
        }
        throw th;
        throw th;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        if (ceqm.m137878i() && !ceqm.m137876g()) {
            adpm.m50942b(getApplicationContext());
        }
    }

    public final void onDestroy() {
        adpm.m50943c(getApplicationContext());
    }
}
