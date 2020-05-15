package p000;

import android.content.SharedPreferences;
import java.util.Iterator;

/* renamed from: bbby */
final /* synthetic */ class bbby implements bqeh {

    /* renamed from: a */
    private final bbch f102297a;

    public bbby(bbch bbch) {
        this.f102297a = bbch;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch;
        bqgg bqgg;
        bbch bbch2;
        String str;
        String str2;
        String str3;
        String str4 = "Failed to commit migration version to disk.";
        bbch bbch3 = this.f102297a;
        Void voidR = (Void) obj;
        bbdd bbdd = bbch3.f102320g;
        boolean z = false;
        if (!bbbb.m87768a(bbdd.f102402a)) {
            bbbb.m87771c(bbdd.f102402a);
            bbbb.m87769a(bbdd.f102402a, bbba.m87766a((int) ceni.m137523g()));
            bqgg = bqga.m112775a((Object) false);
            bbch = bbch3;
        } else {
            bbba a = bbba.m87766a((int) ceni.m137523g());
            bbba a2 = bbbb.m87767a(bbdd.f102402a, bbdd.f102403b);
            int i = a.f102265d;
            int i2 = a2.f102265d;
            if (i == i2) {
                bbch = bbch3;
                z = true;
            } else if (i < i2) {
                bbev.m87910b("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", a2, a);
                bawt bawt = bbdd.f102403b;
                String valueOf = String.valueOf(a2);
                String valueOf2 = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
                sb.append("Downgraded file key from ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                sb.append(".");
                bawt.mo55999a("FileKey migrations unexpected downgrade.", new Exception(sb.toString()));
                bbbb.m87769a(bbdd.f102402a, a);
                bbch = bbch3;
            } else {
                int i3 = i2 + 1;
                while (i3 <= a.f102265d) {
                    try {
                        bbba a3 = bbba.m87766a(i3);
                        int ordinal = a3.ordinal();
                        int i4 = i3;
                        if (ordinal == 1) {
                            str3 = str;
                            bbch = bbch2;
                            SharedPreferences a4 = bbfh.m87928a(bbdd.f102402a, "gms_icing_mdd_shared_files", bbdd.f102404c);
                            SharedPreferences.Editor edit = a4.edit();
                            Iterator<String> it = a4.getAll().keySet().iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    bavt a5 = bbdd.mo56077a(next);
                                    Iterator<String> it2 = it;
                                    bavu bavu = (bavu) bbfh.m87929a(a4, next, (bxxk) bavu.f101935d.mo74142c(7));
                                    if (bavu == null) {
                                        bbev.m87905a("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(next);
                                        it = it2;
                                    } else {
                                        bbfh.m87932a(edit, next);
                                        bbfh.m87933a(edit, bbdd.m87831b(a5), bavu);
                                        it = it2;
                                    }
                                } catch (bbdc e) {
                                    bbev.m87906a("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next);
                                    bbdd.f102403b.mo55999a("Failed to deserialize file key, remove and continue.", e);
                                    edit.remove(next);
                                    it = it;
                                }
                            }
                            if (!edit.commit()) {
                                bbev.m87904a("Failed to commit migration metadata to disk");
                                bbdd.f102403b.mo55999a("Failed to commit migration metadata to disk.", new Exception("Migrate to DownloadTransform failed."));
                            } else {
                                bbch3 = bbch;
                                str2 = str3;
                                bbbb.m87769a(bbdd.f102402a, bbba.m87766a(i4));
                                i3 = i4 + 1;
                                str4 = str2;
                            }
                        } else if (ordinal == 2) {
                            SharedPreferences a6 = bbfh.m87928a(bbdd.f102402a, "gms_icing_mdd_shared_files", bbdd.f102404c);
                            SharedPreferences.Editor edit2 = a6.edit();
                            for (String str5 : a6.getAll().keySet()) {
                                try {
                                    bavt a7 = bbdd.mo56077a(str5);
                                    bbch bbch4 = bbch2;
                                    str3 = str;
                                    bavu bavu2 = (bavu) bbfh.m87929a(a6, str5, (bxxk) bavu.f101935d.mo74142c(7));
                                    if (bavu2 == null) {
                                        bbev.m87905a("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit2.remove(str5);
                                        bbch2 = bbch4;
                                        str = str3;
                                    } else {
                                        bbfh.m87932a(edit2, str5);
                                        bbfh.m87933a(edit2, bbdd.m87832c(a7), bavu2);
                                        bbch2 = bbch4;
                                        str = str3;
                                    }
                                } catch (bbdc e2) {
                                    str3 = str;
                                    bbev.m87906a("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str5);
                                    bbdd.f102403b.mo55999a("Failed to deserialize file key, remove and continue.", e2);
                                    edit2.remove(str5);
                                    bbch2 = bbch2;
                                    str = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = str3;
                                    String valueOf3 = String.valueOf(a);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                                    sb2.append("Failed to commit migration version to disk. Fail to set target version to ");
                                    sb2.append(valueOf3);
                                    sb2.append(".");
                                    bbev.m87904a(sb2.toString());
                                    bawt bawt2 = bbdd.f102403b;
                                    String valueOf4 = String.valueOf(a);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                                    sb3.append("Fail to set target version ");
                                    sb3.append(valueOf4);
                                    sb3.append(".");
                                    bawt2.mo55999a(str2, new Exception(sb3.toString()));
                                    throw th;
                                }
                            }
                            str3 = str;
                            bbch = bbch2;
                            if (!edit2.commit()) {
                                bbev.m87904a("Failed to commit migration metadata to disk");
                                bbdd.f102403b.mo55999a("Failed to commit migration metadata to disk.", new Exception("Migrate to ChecksumOnly failed."));
                            } else {
                                bbch3 = bbch;
                                str2 = str3;
                                try {
                                    bbbb.m87769a(bbdd.f102402a, bbba.m87766a(i4));
                                    i3 = i4 + 1;
                                    str4 = str2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (bbbb.m87767a(bbdd.f102402a, bbdd.f102403b).f102265d != a.f102265d && !bbbb.m87769a(bbdd.f102402a, a)) {
                                        String valueOf32 = String.valueOf(a);
                                        StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 75);
                                        sb22.append("Failed to commit migration version to disk. Fail to set target version to ");
                                        sb22.append(valueOf32);
                                        sb22.append(".");
                                        bbev.m87904a(sb22.toString());
                                        bawt bawt22 = bbdd.f102403b;
                                        String valueOf42 = String.valueOf(a);
                                        StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf42).length() + 28);
                                        sb32.append("Fail to set target version ");
                                        sb32.append(valueOf42);
                                        sb32.append(".");
                                        bawt22.mo55999a(str2, new Exception(sb32.toString()));
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            String name = a3.name();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 33);
                            sb4.append("Upgrade to version ");
                            sb4.append(name);
                            sb4.append("not supported!");
                            throw new UnsupportedOperationException(sb4.toString());
                        }
                        if (bbbb.m87767a(bbdd.f102402a, bbdd.f102403b).f102265d != a.f102265d && !bbbb.m87769a(bbdd.f102402a, a)) {
                            String valueOf5 = String.valueOf(a);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 75);
                            sb5.append("Failed to commit migration version to disk. Fail to set target version to ");
                            sb5.append(valueOf5);
                            sb5.append(".");
                            bbev.m87904a(sb5.toString());
                            bawt bawt3 = bbdd.f102403b;
                            String valueOf6 = String.valueOf(a);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
                            sb6.append("Fail to set target version ");
                            sb6.append(valueOf6);
                            sb6.append(".");
                            bawt3.mo55999a(str3, new Exception(sb6.toString()));
                        }
                        z = false;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str;
                        String valueOf322 = String.valueOf(a);
                        StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf322).length() + 75);
                        sb222.append("Failed to commit migration version to disk. Fail to set target version to ");
                        sb222.append(valueOf322);
                        sb222.append(".");
                        bbev.m87904a(sb222.toString());
                        bawt bawt222 = bbdd.f102403b;
                        String valueOf422 = String.valueOf(a);
                        StringBuilder sb322 = new StringBuilder(String.valueOf(valueOf422).length() + 28);
                        sb322.append("Fail to set target version ");
                        sb322.append(valueOf422);
                        sb322.append(".");
                        bawt222.mo55999a(str2, new Exception(sb322.toString()));
                        throw th;
                    }
                }
                if (bbbb.m87767a(bbdd.f102402a, bbdd.f102403b).f102265d != a.f102265d && !bbbb.m87769a(bbdd.f102402a, a)) {
                    String valueOf7 = String.valueOf(a);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf7).length() + 75);
                    sb7.append("Failed to commit migration version to disk. Fail to set target version to ");
                    sb7.append(valueOf7);
                    sb7.append(".");
                    bbev.m87904a(sb7.toString());
                    bawt bawt4 = bbdd.f102403b;
                    String valueOf8 = String.valueOf(a);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf8).length() + 28);
                    sb8.append("Fail to set target version ");
                    sb8.append(valueOf8);
                    sb8.append(".");
                    bawt4.mo55999a(str, new Exception(sb8.toString()));
                }
                bbch = bbch2;
                z = true;
            }
            bqgg = bqga.m112775a(Boolean.valueOf(z));
        }
        return bqdx.m112674a(bqgg, new bbbw(bbch), bbch.f102327n);
    }
}
