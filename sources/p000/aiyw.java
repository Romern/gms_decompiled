package p000;

import android.content.Context;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;

/* renamed from: aiyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyw implements ajgp {

    /* renamed from: a */
    public final ajgu f70108a;

    /* renamed from: b */
    public final ajej f70109b;

    /* renamed from: c */
    public ajgp f70110c = null;

    /* renamed from: d */
    public final buqh f70111d;

    /* renamed from: e */
    private final Context f70112e;

    /* renamed from: f */
    private final aiyr f70113f;

    /* renamed from: g */
    private final aiyx f70114g;

    public aiyw(Context context) {
        this.f70112e = context;
        this.f70108a = (ajgu) ahgz.m55754a(context, ajgu.class);
        this.f70109b = (ajej) ahgz.m55754a(context, ajej.class);
        this.f70113f = (aiyr) ahgz.m55754a(context, aiyr.class);
        ((ajai) ahgz.m55754a(context, ajai.class)).mo38387a(new aiyv(this));
        this.f70114g = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f70111d = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: a */
    private final void m58243a(ahfv ahfv, HashSet hashSet, String str) {
        ajgu ajgu = this.f70108a;
        ajgu.f70594c.mo72984b();
        srn srn = ahfq.f67120a;
        ahfv.toString();
        ajgt ajgt = ajgu.f70595d;
        if (ajgt != null && ajgt.f70588a.equals(ahfv)) {
            ajgt ajgt2 = ajgu.f70595d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            byym byym = ajgt2.f70590c.f168926i;
            if (byym == null) {
                byym = byym.f168972f;
            }
            long j = elapsedRealtime + byym.f168977d;
            ajgt2.f70591d = j;
            long j2 = ajgt2.f70589b;
            if (j > j2) {
                ajgt2.f70591d = j2;
                return;
            }
            return;
        }
        ajgu.f70595d = new ajgt(ahfv, ((ajat) ahgz.m55754a(ajgu.f70593b, ajat.class)).f70278f);
        this.f70114g.mo38316a(this.f70112e, (String) null, 14, hashSet);
        try {
            byte[] bArr = ahfv.f67128a;
            int length = bArr.length;
            if (length > 1) {
                byte a = aiwg.m58065a();
                if (bArr[0] == a) {
                    int i = length - 1;
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 1, bArr2, 0, i);
                    bxvd da = byze.f169064e.mo74144da();
                    bxtx a2 = bxtx.m123261a(bArr2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byze byze = (byze) da.f164949b;
                    a2.getClass();
                    byze.f169066a |= 2;
                    byze.f169068c = a2;
                    bxvd da2 = byzh.f169078d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byzh byzh = (byzh) da2.f164949b;
                    "__audio_bytes".getClass();
                    int i2 = byzh.f169080a | 2;
                    byzh.f169080a = i2;
                    byzh.f169082c = "__audio_bytes";
                    "__reserved_namespace".getClass();
                    byzh.f169080a = i2 | 1;
                    byzh.f169081b = "__reserved_namespace";
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byze byze2 = (byze) da.f164949b;
                    byzh byzh2 = (byzh) da2.mo74062i();
                    byzh2.getClass();
                    byze2.f169067b = byzh2;
                    byze2.f169066a |= 1;
                    bxvf bxvf = (bxvf) byzr.f169150h.mo74144da();
                    bxvf.mo74130a(str);
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    byzr byzr = (byzr) bxvf.f164949b;
                    byze byze3 = (byze) da.mo74062i();
                    byze3.getClass();
                    byzr.f169154c = byze3;
                    byzr.f169152a |= 1;
                    byzr byzr2 = (byzr) bxvf.mo74062i();
                    bxvd bxvd = (bxvd) byzr2.mo74142c(5);
                    bxvd.mo73625a((bxvk) byzr2);
                    ((ajbn) ahgz.m55754a(this.f70112e, ajbn.class)).mo38449a((bxvf) bxvd);
                    return;
                }
                String format = String.format("%s Audio token does not match prefix: %s, %s", "AudioBytesUtil: ", srv.m36163c(bArr), String.valueOf((int) a));
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68432a("aiwg", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("%s", format);
                throw new UnsupportedEncodingException(format);
            }
            String format2 = String.format("%s Audio token is too short for decoding.", "AudioBytesUtil: ");
            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl2.mo68432a("aiwg", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("%s", format2);
            throw new UnsupportedEncodingException(format2);
        } catch (UnsupportedEncodingException e) {
            bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl3.mo68432a("aiyw", "a", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68424a("%s Unable to decode invalid audio message: %s", "TokenListener: ", e.toString());
        }
    }

    /* renamed from: a */
    public final void mo38311a(ahfv ahfv, byzy byzy) {
        ahfv ahfv2 = ahfv;
        byzy byzy2 = byzy;
        this.f70111d.mo72984b();
        HashSet hashSet = new HashSet();
        bxwc bxwc = byzy2.f169195c;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byzz byzz = (byzz) bxwc.get(i2);
            srn srn = ahfq.f67120a;
            ahfv.mo36407a();
            bzbu a = bzbu.m125627a(byzz.f169199b);
            if (a == null) {
                a = bzbu.TOKEN_MEDIUM_UNKNOWN;
            }
            ajgs.m58685a(a);
            bzbu a2 = bzbu.m125627a(byzz.f169199b);
            if (a2 == null) {
                a2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            }
            hashSet.add(a2);
        }
        bxwc bxwc2 = byzy2.f169195c;
        int size2 = bxwc2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            bzbu a3 = bzbu.m125627a(((byzz) bxwc2.get(i3)).f169199b);
            if (a3 == null) {
                a3 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            }
            i3++;
            if (a3 == bzbu.AUDIO_ULTRASOUND_PASSBAND) {
                if (this.f70113f.mo38303e()) {
                    String str = this.f70113f.f70097h.f70083a;
                    ajgu ajgu = this.f70108a;
                    ajgu.f70594c.mo72984b();
                    srn srn2 = ahfq.f67120a;
                    ahfv.toString();
                    ajgt ajgt = ajgu.f70595d;
                    if (ajgt != null && ajgt.f70588a.equals(ahfv2)) {
                        ajgt ajgt2 = ajgu.f70595d;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        byym byym = ajgt2.f70590c.f168926i;
                        if (byym == null) {
                            byym = byym.f168972f;
                        }
                        long j = elapsedRealtime + byym.f168977d;
                        ajgt2.f70591d = j;
                        long j2 = ajgt2.f70589b;
                        if (j > j2) {
                            ajgt2.f70591d = j2;
                            return;
                        }
                        return;
                    }
                    ajgu.f70595d = new ajgt(ahfv2, ((ajat) ahgz.m55754a(ajgu.f70593b, ajat.class)).f70278f);
                    this.f70114g.mo38316a(this.f70112e, (String) null, 14, hashSet);
                    try {
                        byte[] bArr = ahfv2.f67128a;
                        int length = bArr.length;
                        if (length > 1) {
                            byte a4 = aiwg.m58065a();
                            if (bArr[0] == a4) {
                                int i4 = length - 1;
                                byte[] bArr2 = new byte[i4];
                                System.arraycopy(bArr, 1, bArr2, 0, i4);
                                bxvd da = byze.f169064e.mo74144da();
                                bxtx a5 = bxtx.m123261a(bArr2);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                byze byze = (byze) da.f164949b;
                                a5.getClass();
                                byze.f169066a |= 2;
                                byze.f169068c = a5;
                                bxvd da2 = byzh.f169078d.mo74144da();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                byzh byzh = (byzh) da2.f164949b;
                                "__audio_bytes".getClass();
                                int i5 = byzh.f169080a | 2;
                                byzh.f169080a = i5;
                                byzh.f169082c = "__audio_bytes";
                                "__reserved_namespace".getClass();
                                byzh.f169080a = i5 | 1;
                                byzh.f169081b = "__reserved_namespace";
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                byze byze2 = (byze) da.f164949b;
                                byzh byzh2 = (byzh) da2.mo74062i();
                                byzh2.getClass();
                                byze2.f169067b = byzh2;
                                byze2.f169066a |= 1;
                                bxvf bxvf = (bxvf) byzr.f169150h.mo74144da();
                                bxvf.mo74130a(str);
                                if (bxvf.f164950c) {
                                    bxvf.mo74035c();
                                    bxvf.f164950c = false;
                                }
                                byzr byzr = (byzr) bxvf.f164949b;
                                byze byze3 = (byze) da.mo74062i();
                                byze3.getClass();
                                byzr.f169154c = byze3;
                                byzr.f169152a |= 1;
                                byzr byzr2 = (byzr) bxvf.mo74062i();
                                bxvd bxvd = (bxvd) byzr2.mo74142c(5);
                                bxvd.mo73625a((bxvk) byzr2);
                                ((ajbn) ahgz.m55754a(this.f70112e, ajbn.class)).mo38449a((bxvf) bxvd);
                                return;
                            }
                            Object[] objArr = new Object[3];
                            objArr[0] = "AudioBytesUtil: ";
                            char[] cArr = srv.f45064a;
                            char[] cArr2 = new char[((length * 3) - 1)];
                            int i6 = 0;
                            while (true) {
                                int length2 = bArr.length - 1;
                                if (i < length2) {
                                    byte b = bArr[i] & 255;
                                    int i7 = i6 + 1;
                                    cArr2[i6] = srv.f45064a[b >>> 4];
                                    int i8 = i7 + 1;
                                    cArr2[i7] = srv.f45064a[b & 15];
                                    cArr2[i8] = ':';
                                    i++;
                                    i6 = i8 + 1;
                                } else {
                                    byte b2 = bArr[length2] & 255;
                                    cArr2[i6] = srv.f45064a[b2 >>> 4];
                                    cArr2[i6 + 1] = srv.f45064a[b2 & 15];
                                    objArr[1] = new String(cArr2);
                                    objArr[2] = String.valueOf((int) a4);
                                    String format = String.format("%s Audio token does not match prefix: %s, %s", objArr);
                                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                                    bnsl.mo68432a("aiwg", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68420a("%s", format);
                                    throw new UnsupportedEncodingException(format);
                                }
                            }
                        } else {
                            String format2 = String.format("%s Audio token is too short for decoding.", "AudioBytesUtil: ");
                            bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                            bnsl2.mo68432a("aiwg", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68420a("%s", format2);
                            throw new UnsupportedEncodingException(format2);
                        }
                    } catch (UnsupportedEncodingException e) {
                        bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl3.mo68432a("aiyw", "a", (int) MfiClientException.TYPE_CARD_NOT_CACHED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68424a("%s Unable to decode invalid audio message: %s", "TokenListener: ", e.toString());
                        return;
                    }
                }
            }
        }
        ajgp ajgp = this.f70110c;
        if (ajgp != null) {
            ajgp.mo38311a(ahfv2, byzy2);
        }
        ajgu ajgu2 = this.f70108a;
        srn srn3 = ahfq.f67120a;
        ahfv.toString();
        ajgu2.f70594c.mo72984b();
        if (!ajgu.m58687b(ahfv)) {
            ahfv.toString();
        } else {
            ajgv ajgv = (ajgv) ajgu2.f70592a.get(ahfv2);
            if (ajgv != null) {
                ajgv.mo38622a();
            } else {
                ajgu2.mo38619a(ahfv2);
                i = 1;
            }
        }
        this.f70108a.mo38620a(ahfv2, byzy2);
        if (i != 0) {
            this.f70114g.mo38316a(this.f70112e, (String) null, 14, hashSet);
            this.f70109b.mo38548a();
        }
    }
}
