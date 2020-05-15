package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: bhzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhzc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhzk f119934a;

    public bhzc(bhzk bhzk) {
        this.f119934a = bhzk;
    }

    public final void run() {
        bhzk bhzk = this.f119934a;
        int i = bhzk.f119950a;
        if (i == 0) {
            if (bhzk.f119956g == null) {
                bhyj bhyj = new bhyj();
                bhzk.f119956g = new bhsw(6, (int) cgfr.m145048c(), new File(bhzk.f119953d, "l1"), bhyj, bhzk.f119955f);
                int a = bhzk.f119956g.mo64238a();
                StringBuilder sb = new StringBuilder(37);
                sb.append("l1Storage start with ");
                sb.append(a);
                sb.append(" keys");
                sb.toString();
            }
            if (bhzk.f119957h == null) {
                bhyk bhyk = new bhyk();
                bhzk.f119957h = new bhsw(6, (int) cgfr.m145049d(), new File(bhzk.f119953d, "l2"), bhyk, bhzk.f119955f);
                int a2 = bhzk.f119957h.mo64238a();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("l2Storage start with ");
                sb2.append(a2);
                sb2.append(" keys");
                sb2.toString();
            }
            bhzk.f119950a = 1;
            long b = cgfr.m145047b();
            long j = -1;
            try {
                long j2 = bhzk.f119951b;
                if (j2 == -1) {
                    FileInputStream fileInputStream = new FileInputStream(bhzk.f119952c);
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    byte readByte = dataInputStream.readByte();
                    bhzk.f119951b = dataInputStream.readLong();
                    dataInputStream.close();
                    fileInputStream.close();
                    if (readByte == 2) {
                        j2 = bhzk.f119951b;
                    } else {
                        bhzk.f119951b = -1;
                        throw new IOException("TTL file has wrong version");
                    }
                }
                j = System.currentTimeMillis() - j2;
            } catch (IOException e) {
            }
            if (j < 0) {
                bhzk.mo64449c();
            } else if (j > b) {
                StringBuilder sb3 = new StringBuilder((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION);
                sb3.append("millisecondsSinceClear is ");
                sb3.append(j);
                sb3.append("; ttlMillis is ");
                sb3.append(b);
                sb3.append(". Cache data outdated, clearing nearbyAlertCache index, creating new ttl file");
                sb3.toString();
                bhzk.mo64449c();
            }
        } else {
            bhzk.f119950a = i + 1;
        }
    }
}
