package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bbaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbaz {

    /* renamed from: a */
    public final Context f102256a;

    /* renamed from: b */
    public final bmxv f102257b;

    /* renamed from: c */
    public final Executor f102258c;

    /* renamed from: d */
    private final ayte f102259d;

    /* renamed from: e */
    private final bawt f102260e;

    public bbaz(Context context, ayte ayte, bawt bawt, bmxv bmxv, Executor executor) {
        this.f102256a = context;
        this.f102259d = ayte;
        this.f102260e = bawt;
        this.f102257b = bmxv;
        this.f102258c = executor;
    }

    /* renamed from: d */
    static String m87753d(bavr bavr) {
        return Base64.encodeToString(bavr.serializeToBytes(), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo56050a() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = bbfh.m87928a(this.f102256a, "gms_icing_mdd_groups", this.f102257b);
        SharedPreferences.Editor editor = null;
        for (String str : a.getAll().keySet()) {
            try {
                arrayList.add((bavr) bbfh.m87930a(str, (bxxk) bavr.f101916f.mo74142c(7)));
            } catch (bxwf e) {
                String valueOf = String.valueOf(str);
                throw new bbay(valueOf.length() == 0 ? new String("Failed to deserialize key:") : "Failed to deserialize key:".concat(valueOf), e);
            } catch (bbay e2) {
                String valueOf2 = String.valueOf(str);
                bbev.m87907a(e2, valueOf2.length() == 0 ? new String("Failed to deserialize groupKey:") : "Failed to deserialize groupKey:".concat(valueOf2));
                this.f102260e.mo55999a("Failed to deserialize groupKey", e2);
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return bqga.m112775a((Object) arrayList);
    }

    /* renamed from: b */
    public final bqgg mo56055b() {
        return bqdx.m112674a(mo56050a(), new bbaw(this), this.f102258c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final bqgg mo56057c(bavr bavr) {
        return bqga.m112775a((bavs) bbfh.m87929a(bbfh.m87928a(this.f102256a, "gms_icing_mdd_group_key_properties", this.f102257b), m87753d(bavr), (bxxk) bavs.f101923c.mo74142c(7)));
    }

    /* renamed from: e */
    public final void mo56060e() {
        mo56059d().delete();
    }

    /* renamed from: f */
    public final bqgg mo56061f() {
        bbfh.m87928a(this.f102256a, "gms_icing_mdd_groups", this.f102257b).edit().clear().commit();
        bbfh.m87928a(this.f102256a, "gms_icing_mdd_group_key_properties", this.f102257b).edit().clear().commit();
        mo56060e();
        return bqga.m112775a((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final File mo56059d() {
        bmxv bmxv = this.f102257b;
        String str = "gms_icing_mdd_garbage_file";
        if (bmxv != null && bmxv.mo66813a()) {
            String valueOf = String.valueOf((String) this.f102257b.mo66814b());
            str = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
        return new File(this.f102256a.getFilesDir(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bqgg mo56056b(bavr bavr) {
        return bqga.m112775a(Boolean.valueOf(bbfh.m87934a(bbfh.m87928a(this.f102256a, "gms_icing_mdd_groups", this.f102257b), m87753d(bavr))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* renamed from: c */
    public final List mo56058c() {
        List list;
        IOException e;
        File d = mo56059d();
        try {
            FileInputStream fileInputStream = new FileInputStream(d);
            try {
                ByteBuffer allocate = ByteBuffer.allocate((int) d.length());
                try {
                    fileInputStream.getChannel().read(allocate);
                    allocate.rewind();
                    list = bbfg.m87926a(allocate, bavd.class, (bxxk) bavd.f101869m.mo74142c(7));
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    list = null;
                    bbev.m87908a(e, "%s: IOException occurred while reading file groups.", "FileGroupsMetadata");
                    if (list != null) {
                    }
                }
                if (list != null) {
                    return bngx.m109376e();
                }
                return list;
            } catch (IllegalArgumentException e4) {
                bbev.m87908a(e4, "%s: Exception while reading from stale groups into buffer.", "FileGroupsMetadata");
                return bngx.m109376e();
            }
        } catch (FileNotFoundException e5) {
            d.getAbsolutePath();
            return bngx.m109376e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo56051a(bavr bavr) {
        return bqga.m112775a((bavd) bbfh.m87929a(bbfh.m87928a(this.f102256a, "gms_icing_mdd_groups", this.f102257b), m87753d(bavr), (bxxk) bavd.f101869m.mo74142c(7)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo56052a(bavr bavr, bavd bavd) {
        return bqga.m112775a(Boolean.valueOf(bbfh.m87935a(bbfh.m87928a(this.f102256a, "gms_icing_mdd_groups", this.f102257b), m87753d(bavr), bavd)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56053a(bavd bavd) {
        long a = (this.f102259d.mo54417a() / 1000) + bavd.f101877g;
        bauz bauz = bavd.f101872b;
        if (bauz == null) {
            bauz = bauz.f101860g;
        }
        bxvd bxvd = (bxvd) bauz.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bauz);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bauz bauz2 = (bauz) bxvd.f164949b;
        bauz2.f101862a |= 1;
        bauz2.f101863b = a;
        bauz bauz3 = (bauz) bxvd.mo74062i();
        bxvd bxvd2 = (bxvd) bavd.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bavd);
        bavc bavc = (bavc) bxvd2;
        if (bavc.f164950c) {
            bavc.mo74035c();
            bavc.f164950c = false;
        }
        bavd bavd2 = (bavd) bavc.f164949b;
        bauz3.getClass();
        bavd2.f101872b = bauz3;
        bavd2.f101871a |= 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add((bavd) bavc.mo74062i());
        return mo56054a(arrayList);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56054a(List list) {
        File d = mo56059d();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(d, true);
            try {
                ByteBuffer a = bbfg.m87925a(list);
                if (a != null) {
                    fileOutputStream.getChannel().write(a);
                }
                fileOutputStream.close();
                return true;
            } catch (IOException e) {
                bbev.m87904a("IOException occurred while writing file groups.");
                return false;
            }
        } catch (FileNotFoundException e2) {
            bbev.m87905a("File %s not found while writing.", d.getAbsolutePath());
            return false;
        }
    }
}
