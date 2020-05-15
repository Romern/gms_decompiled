package p000;

import android.content.Context;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: udg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udg extends uci {

    /* renamed from: f */
    private final ubq f47294f;

    public udg(ubk ubk, ubq ubq, uto uto) {
        super("GetDebugContentsOperati", ubk, uto, "378076965553", 68);
        this.f47294f = ubq;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void
     arg types: [uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, int, uaw]
     candidates:
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, com.google.android.gms.drive.DriveId, uaw):com.google.android.gms.drive.DriveId
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* renamed from: c */
    public final void mo27231c(Context context) {
        bobb a;
        Contents contents = null;
        try {
            contents = this.f47294f.mo27162a(mo27233b(), 805306368, this.f47238b.asBinder());
            try {
                HashSet<File> hashSet = new HashSet();
                for (String str : vou.f49686a) {
                    String valueOf = String.valueOf(str);
                    File databasePath = context.getDatabasePath(valueOf.length() == 0 ? new String("DocList.db") : "DocList.db".concat(valueOf));
                    if (databasePath.exists()) {
                        hashSet.add(databasePath);
                    }
                }
                if (hashSet.size() != 0) {
                    a = bobb.m111033a();
                    ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(contents.f30720a.getFileDescriptor()));
                    a.mo68842a(zipOutputStream);
                    for (File file : hashSet) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        a.mo68842a(fileInputStream);
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        srz.m36172a(fileInputStream, zipOutputStream);
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                    }
                    a.close();
                }
                new FileInputStream(contents.f30720a.getFileDescriptor()).getChannel().position(0L);
                this.f47238b.mo27975a(new OnContentsResponse(contents, false));
                if (contents != null) {
                    this.f47294f.mo27167a(mo27233b(), contents.f30721b, MetadataBundle.m23056a(), false, uaw.f47070a);
                }
            } catch (IOException e) {
                try {
                    throw new aaaj(8, "Error providing debug contents. Something failed dumping the DB");
                } catch (Throwable th) {
                    th = th;
                    if (contents != null) {
                        this.f47294f.mo27167a(mo27233b(), contents.f30721b, MetadataBundle.m23056a(), false, uaw.f47070a);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (contents != null) {
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new aaaj(8, "Error providing debug contents. Something failed dumping the DB");
        } catch (Throwable th3) {
            th = th3;
            if (contents != null) {
            }
            throw th;
        }
    }
}
