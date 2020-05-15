package p000;

import android.net.Uri;

/* renamed from: auhh */
public final /* synthetic */ class auhh implements bmxj {

    /* renamed from: a */
    private final Uri f91814a;

    /* renamed from: b */
    private final Object f91815b;

    /* renamed from: c */
    private final String f91816c;

    public auhh(Uri uri, Object obj, String str) {
        this.f91814a = uri;
        this.f91815b = obj;
        this.f91816c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[Catch:{ ClassCastException | NullPointerException -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[Catch:{ ClassCastException | NullPointerException -> 0x00e8 }] */
    public final Object apply(Object obj) {
        boolean z;
        Uri uri = this.f91814a;
        Object obj2 = this.f91815b;
        String str = this.f91816c;
        auhc auhc = (auhc) obj;
        if (auhc != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        bxvd bxvd = (bxvd) auhc.mo74142c(5);
        bxvd.mo73625a((bxvk) auhc);
        try {
            String lastPathSegment = uri.getLastPathSegment();
            int hashCode = lastPathSegment.hashCode();
            char c = 65535;
            if (hashCode != -1609594047) {
                if (hashCode == -1342497116 && lastPathSegment.equals("corruptConfigs")) {
                    c = 1;
                    if (c == 0) {
                        bmxy.m108588a(obj2 != null);
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        auhc auhc2 = (auhc) bxvd.f164949b;
                        auhc auhc3 = auhc.f91805d;
                        auhc2.f91807a |= 1;
                        auhc2.f91808b = booleanValue;
                    } else if (c != 1) {
                        String valueOf = String.valueOf(uri.getPath());
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown path - ") : "Unknown path - ".concat(valueOf));
                    } else if (!"append".equals(str)) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        auhc auhc4 = auhc.f91805d;
                        ((auhc) bxvd.f164949b).f91809c = bxvk.m124030de();
                        Iterable iterable = (Iterable) obj2;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        auhc auhc5 = (auhc) bxvd.f164949b;
                        auhc5.mo50522a();
                        bxsy.m123078a(iterable, auhc5.f91809c);
                    } else {
                        String str2 = (String) obj2;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        auhc auhc6 = (auhc) bxvd.f164949b;
                        auhc auhc7 = auhc.f91805d;
                        str2.getClass();
                        auhc6.mo50522a();
                        auhc6.f91809c.add(str2);
                    }
                    return (auhc) bxvd.mo74062i();
                }
            } else if (lastPathSegment.equals("enabled")) {
                c = 0;
                if (c == 0) {
                }
                return (auhc) bxvd.mo74062i();
            }
            if (c == 0) {
            }
            return (auhc) bxvd.mo74062i();
        } catch (ClassCastException | NullPointerException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
