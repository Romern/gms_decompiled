package p000;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: aamu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamu {

    /* renamed from: a */
    public final SparseArray f28497a;

    /* renamed from: b */
    private final SparseIntArray f28498b;

    /* renamed from: c */
    private final Context f28499c;

    /* renamed from: d */
    private final aeat f28500d;

    /* renamed from: e */
    private final aakl f28501e;

    /* renamed from: f */
    private final sqv f28502f;

    public aamu(Context context, aeat aeat, aakl aakl, sqv sqv) {
        this.f28499c = context;
        this.f28500d = aeat;
        this.f28501e = aakl;
        this.f28502f = sqv;
        aebl aebl = new aebl();
        aebl.f63099k = "PersistConnectionInfos";
        aebl.f63097i = "com.google.android.gms.gcm.HeartbeatAlarm$ConnectionInfoPersistService";
        aebl.f63070a = 21600;
        aebl.f63071b = 3600;
        this.f28500d.mo33984a(aebl.mo33974b());
        String[] split = cedc.f182364a.mo6606a().mo78866g().split(";");
        int length = split.length;
        SparseIntArray sparseIntArray = new SparseIntArray(length);
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                try {
                    sparseIntArray.put(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    String str2 = split2[0];
                    String str3 = split2[1];
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(str3).length());
                    sb.append("Failed to parse key-value pair: ");
                    sb.append(str2);
                    sb.append(", ");
                    sb.append(str3);
                    Log.e("GCM", sb.toString());
                }
            }
        }
        this.f28498b = sparseIntArray;
        this.f28497a = new SparseArray();
        m21572b();
        for (int i = 0; i < this.f28497a.size(); i++) {
            aamx aamx = (aamx) this.f28497a.valueAt(i);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                C1245ok okVar = aamx.f28510a;
                if (i2 >= okVar.f26809h) {
                    break;
                }
                aamv aamv = (aamv) okVar.mo15621c(i2);
                if (aamv.mo17068b() > 0 && System.currentTimeMillis() - aamv.mo17068b() > aamx.f28509b) {
                    arrayList.add((String) aamx.f28510a.mo15620b(i2));
                }
                i2++;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                aamx.f28510a.remove((String) arrayList.get(i3));
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m21572b() {
        int i;
        File file = new File(aaka.m21378c(this.f28499c).getFilesDir(), "gcm_connection_infos");
        if (file.exists()) {
            try {
                try {
                    bxwc bxwc = ((aaiu) GeneratedMessageLite.m124014a(aaiu.f28231b, srz.m36174a(file))).f28233a;
                    int size = bxwc.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aait aait = (aait) bxwc.get(i2);
                        if ((aait.f28221a & 64) != 0) {
                            i = aait.f28228h;
                        } else {
                            i = 1;
                        }
                        aamx a = mo17064a(i);
                        C1245ok okVar = a.f28510a;
                        if (okVar.f26809h == a.f28512d) {
                            okVar.remove(a.mo17080a());
                        }
                        a.f28510a.put(aait.f28222b, new aamv(a, aait.f28219k.mo74141a(aait)));
                    }
                } catch (bxwf e) {
                    Log.w("GCM", "Failed to parse connection info from storage.");
                }
            } catch (IOException e2) {
                Log.w("GCM", "Failed to load connection info from storage.");
            }
        }
    }

    /* renamed from: a */
    public final synchronized aamx mo17064a(int i) {
        aamx aamx;
        aamx = (aamx) this.f28497a.get(i);
        if (aamx == null) {
            aamx = new aamx(i, this.f28498b.get(i, (int) cedc.f182364a.mo6606a().mo78869j()), this.f28501e);
            this.f28497a.put(i, aamx);
        }
        return aamx;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9 A[SYNTHETIC, Splitter:B:43:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0103 A[SYNTHETIC, Splitter:B:50:0x0103] */
    /* renamed from: a */
    public final synchronized void mo17065a() {
        String str;
        String sb;
        bxvd da = aaiu.f28231b.mo74144da();
        for (int i = 0; i < this.f28497a.size(); i++) {
            aamx aamx = (aamx) this.f28497a.valueAt(i);
            int i2 = 0;
            while (true) {
                C1245ok okVar = aamx.f28510a;
                if (i2 >= okVar.f26809h) {
                    break;
                }
                aait c = ((aamv) okVar.mo15621c(i2)).mo17069c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aaiu aaiu = (aaiu) da.f164949b;
                c.getClass();
                if (!aaiu.f28233a.mo73666a()) {
                    aaiu.f28233a = GeneratedMessageLite.m124021a(aaiu.f28233a);
                }
                aaiu.f28233a.add(c);
                i2++;
            }
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(aaka.m21378c(this.f28499c).getFilesDir(), "gcm_connection_infos")));
            try {
                ((aaiu) da.mo74062i()).mo73638a(bufferedOutputStream2);
                bufferedOutputStream2.flush();
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb2.append("Failed to persist ConnectionInfos: ");
                    sb2.append(valueOf);
                    str = "GCM";
                    sb = sb2.toString();
                    Log.e(str, sb);
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    String valueOf2 = String.valueOf(e);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                    sb3.append("Failed to persist ConnectionInfos: ");
                    sb3.append(valueOf2);
                    Log.e("GCM", sb3.toString());
                    if (bufferedOutputStream != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e3) {
                            String valueOf3 = String.valueOf(e3);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                            sb4.append("Failed to persist ConnectionInfos: ");
                            sb4.append(valueOf3);
                            Log.e("GCM", sb4.toString());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            String valueOf22 = String.valueOf(e);
            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf22).length() + 35);
            sb32.append("Failed to persist ConnectionInfos: ");
            sb32.append(valueOf22);
            Log.e("GCM", sb32.toString());
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e5) {
                    String valueOf4 = String.valueOf(e5);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 35);
                    sb5.append("Failed to persist ConnectionInfos: ");
                    sb5.append(valueOf4);
                    str = "GCM";
                    sb = sb5.toString();
                    Log.e(str, sb);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (bufferedOutputStream != null) {
            }
            throw th;
        }
    }
}
