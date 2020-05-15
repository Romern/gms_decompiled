package p000;

import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.mdd.OverrideFileGroupRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: afox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afox implements bqfp {

    /* renamed from: a */
    final /* synthetic */ afoy f64483a;

    public afox(afoy afoy) {
        this.f64483a = afoy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Status status;
        int i;
        Void voidR = (Void) obj;
        afoy afoy = this.f64483a;
        afoj afoj = afoy.f64484a;
        OverrideFileGroupRequest overrideFileGroupRequest = afoy.f64485b;
        String str = overrideFileGroupRequest.f79971a;
        if (overrideFileGroupRequest.f79974d.length == overrideFileGroupRequest.f79975e.length) {
            SharedPreferences sharedPreferences = afoj.f64439b.getSharedPreferences("gms_icing_mdd_overrider_groups", 0);
            long j = sharedPreferences.getLong("_key_next_file_name", System.currentTimeMillis());
            int length = overrideFileGroupRequest.f79973c.length;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                String[] strArr = overrideFileGroupRequest.f79974d;
                if (i2 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i2];
                ParcelFileDescriptor parcelFileDescriptor = overrideFileGroupRequest.f79975e[i2];
                if (length == 0) {
                    i = 1;
                } else {
                    i = 2;
                }
                try {
                    File b = befj.m94963a(afoj.f64439b).mo60665b(bbfd.m87916a(afoj.f64439b, i, bmvz.f131120a));
                    long j2 = j + 1;
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("datadownloadfile_override_");
                    sb.append(j);
                    File file = new File(b, sb.toString());
                    File parentFile = file.getParentFile();
                    sdo.m34959a(parentFile);
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.getAbsolutePath();
                    try {
                        srj.m36118a(new FileInputStream(parcelFileDescriptor.getFileDescriptor()), file);
                        parcelFileDescriptor.close();
                        befh a = befi.m94962a(afoj.f64439b);
                        a.mo60659a(file);
                        arrayList.add(new MddFile(str2, a.mo60657a().toString()));
                        i2++;
                        j = j2;
                    } catch (IOException e) {
                        bbev.m87904a("IOException occurred while copying files to mdd directory");
                    }
                } catch (IOException e2) {
                    bbev.m87904a("IOException occurred while getting file path");
                }
            }
            if (sharedPreferences.edit().putLong("_key_next_file_name", j).commit()) {
                FileGroupResponse fileGroupResponse = new FileGroupResponse(overrideFileGroupRequest.f79971a, overrideFileGroupRequest.f79972b, 0, arrayList);
                afoj.f64438a.put(afoj.m53354a(overrideFileGroupRequest.f79971a, overrideFileGroupRequest.f79972b, overrideFileGroupRequest.f79976f), fileGroupResponse);
                status = Status.f30107a;
                afoy afoy2 = this.f64483a;
                OverrideFileGroupRequest overrideFileGroupRequest2 = afoy2.f64485b;
                Object[] objArr = {"Service", overrideFileGroupRequest2.f79971a, overrideFileGroupRequest2.f79972b};
                afoy2.f64486c.mo11797a(status);
            }
        }
        status = new Status(13);
        afoy afoy22 = this.f64483a;
        OverrideFileGroupRequest overrideFileGroupRequest22 = afoy22.f64485b;
        Object[] objArr2 = {"Service", overrideFileGroupRequest22.f79971a, overrideFileGroupRequest22.f79972b};
        try {
            afoy22.f64486c.mo11797a(status);
        } catch (RemoteException e3) {
            bbev.m87911b(e3, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        try {
            this.f64483a.mo6503a(Status.f30109c);
        } catch (RemoteException e) {
            bbev.m87911b(e, "Client died during DiagnosticsOverrideOperation", new Object[0]);
        }
    }
}
