package p000;

import android.os.Environment;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.update.ChimeraUpdateFromSdCardService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avkl extends dck implements avkm {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardService f93292a;

    public avkl() {
        super("com.google.android.gms.update.IUpdateFromSdCardService");
    }

    /* renamed from: a */
    public final int mo51333a() {
        return this.f93292a.f109442b;
    }

    /* renamed from: b */
    public final void mo51335b(String str) {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.f93292a;
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("verifyUpdate: ");
        } else {
            "verifyUpdate: ".concat(valueOf);
        }
        chimeraUpdateFromSdCardService.f109442b = 3;
        chimeraUpdateFromSdCardService.mo59655a();
        alai.f73223a.mo26186a(new avll(chimeraUpdateFromSdCardService), alai.m60752c(), str);
    }

    /* renamed from: c */
    public final void mo51336c() {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.f93292a;
        String valueOf = String.valueOf((Object) null);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("installUpdate ");
        sb.append(valueOf);
        sb.toString();
        Log.e("CmaUpdateFromSdCardS", "no last verified file! cannot install");
        new avjw(chimeraUpdateFromSdCardService).start();
    }

    /* renamed from: d */
    public final void mo51337d() {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.f93292a;
        chimeraUpdateFromSdCardService.f109443c = null;
        chimeraUpdateFromSdCardService.f109442b = 1;
        chimeraUpdateFromSdCardService.mo59655a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avkl(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        super("com.google.android.gms.update.IUpdateFromSdCardService");
        this.f93292a = chimeraUpdateFromSdCardService;
    }

    /* renamed from: a */
    public final List mo51334a(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("listFilesInDirectory: ");
        } else {
            "listFilesInDirectory: ".concat(valueOf);
        }
        ArrayList arrayList = new ArrayList();
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (str != null) {
            String valueOf2 = String.valueOf(absolutePath);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1 + str.length());
            sb.append(valueOf2);
            sb.append("/");
            sb.append(str);
            absolutePath = sb.toString();
        }
        File[] listFiles = new File(absolutePath).listFiles();
        for (File file : listFiles) {
            if (file.isDirectory() && !file.isHidden()) {
                arrayList.add(String.valueOf(file.getName()).concat("/"));
            } else if (file.isFile() && !file.isHidden() && file.getName().endsWith(".zip")) {
                try {
                    if (avll.m78713a(file) != null) {
                        arrayList.add(file.getName());
                    }
                } catch (IOException e) {
                    Log.w("Exception while reading zip file.", e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            int a = mo51333a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
            return true;
        } else if (i == 3) {
            List a2 = mo51334a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStringList(a2);
            return true;
        } else if (i == 4) {
            mo51335b(parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            mo51336c();
            parcel2.writeNoException();
            return true;
        } else if (i != 6) {
            return false;
        } else {
            mo51337d();
            parcel2.writeNoException();
            return true;
        }
    }
}
