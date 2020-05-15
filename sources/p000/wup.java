package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.p001v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wup {
    /* renamed from: a */
    private static bmxv m42309a(Slice slice, String str) {
        for (SliceItem sliceItem : slice.mo2045b()) {
            if (sliceItem.f1657b.equals("text") && ((TextUtils.isEmpty(str) && sliceItem.mo2048a().isEmpty()) || (!TextUtils.isEmpty(str) && sliceItem.mo2049a(str)))) {
                return bmxv.m108566b(sliceItem.mo2051b());
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: b */
    private static wuo m42312b(Slice slice) {
        bmxv c = m42313c(slice);
        bmxv a = m42309a(slice, (String) null);
        bmxv d = m42314d(slice);
        if (!c.mo66813a() || !a.mo66813a() || !d.mo66813a()) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wup", "b", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("ListSliceBuilderWrapper: addRowFromSliceListItem fail, title=%s, subtitle=%s, action=%s", c.toString(), a.toString(), d.toString());
            return null;
        }
        wun wun = new wun();
        PendingIntent a2 = ((apz) d.mo66814b()).f1970a.mo2299a();
        if (a2 != null) {
            wun.f51385d = a2;
            IconCompat a3 = ((apz) d.mo66814b()).mo2286a();
            if (a3 != null) {
                wun.f51384c = a3;
                String charSequence = ((CharSequence) c.mo66814b()).toString();
                if (charSequence != null) {
                    wun.f51382a = charSequence;
                    String charSequence2 = ((CharSequence) a.mo66814b()).toString();
                    if (charSequence2 != null) {
                        wun.f51383b = charSequence2;
                        String str = wun.f51382a == null ? " title" : "";
                        if (wun.f51383b == null) {
                            str = str.concat(" subtitle");
                        }
                        if (wun.f51384c == null) {
                            str = String.valueOf(str).concat(" icon");
                        }
                        if (wun.f51385d == null) {
                            str = String.valueOf(str).concat(" pendingIntent");
                        }
                        if (str.isEmpty()) {
                            return new wuk(wun.f51382a, wun.f51383b, wun.f51384c, wun.f51385d);
                        }
                        String valueOf = String.valueOf(str);
                        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null icon");
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* renamed from: c */
    private static bmxv m42313c(Slice slice) {
        return m42309a(slice, "title");
    }

    /* renamed from: d */
    private static bmxv m42314d(Slice slice) {
        bmxv bmxv;
        for (SliceItem sliceItem : slice.mo2045b()) {
            if (sliceItem.f1657b.equals("slice")) {
                if (sliceItem.mo2049a("title")) {
                    bmxv d = m42314d(sliceItem.mo2056f());
                    if (d.mo66813a()) {
                        return d;
                    }
                } else {
                    continue;
                }
            } else if (sliceItem.f1657b.equals("action")) {
                Iterator it = sliceItem.mo2056f().mo2045b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bmxv = bmvz.f131120a;
                        break;
                    }
                    SliceItem sliceItem2 = (SliceItem) it.next();
                    if (sliceItem2.f1657b.equals("image")) {
                        bmxv = bmxv.m108566b(sliceItem2.mo2053c());
                        break;
                    }
                }
                bmxv c = m42313c(sliceItem.mo2056f());
                if (bmxv.mo66813a()) {
                    return bmxv.m108566b(apz.m1828a(sliceItem.mo2054d(), (IconCompat) bmxv.mo66814b(), 0, (CharSequence) c.mo66812a("")));
                }
            } else {
                continue;
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public static ArrayList m42310a(Slice slice) {
        ArrayList arrayList = new ArrayList();
        if (slice != null) {
            for (SliceItem sliceItem : slice.mo2045b()) {
                if (sliceItem.f1657b.equals("slice") && sliceItem.mo2049a("list_item")) {
                    Slice f = sliceItem.mo2056f();
                    bmxv c = m42313c(f);
                    wuk wuk = null;
                    bmxv a = m42309a(f, (String) null);
                    bmxv d = m42314d(f);
                    if (!c.mo66813a() || !a.mo66813a() || !d.mo66813a()) {
                        bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                        bnsl.mo68432a("wup", "b", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68425a("ListSliceBuilderWrapper: addRowFromSliceListItem fail, title=%s, subtitle=%s, action=%s", c.toString(), a.toString(), d.toString());
                    } else {
                        wun wun = new wun();
                        PendingIntent a2 = ((apz) d.mo66814b()).f1970a.mo2299a();
                        if (a2 != null) {
                            wun.f51385d = a2;
                            IconCompat a3 = ((apz) d.mo66814b()).mo2286a();
                            if (a3 != null) {
                                wun.f51384c = a3;
                                String charSequence = ((CharSequence) c.mo66814b()).toString();
                                if (charSequence != null) {
                                    wun.f51382a = charSequence;
                                    String charSequence2 = ((CharSequence) a.mo66814b()).toString();
                                    if (charSequence2 != null) {
                                        wun.f51383b = charSequence2;
                                        String str = wun.f51382a == null ? " title" : "";
                                        if (wun.f51383b == null) {
                                            str = str.concat(" subtitle");
                                        }
                                        if (wun.f51384c == null) {
                                            str = String.valueOf(str).concat(" icon");
                                        }
                                        if (wun.f51385d == null) {
                                            str = String.valueOf(str).concat(" pendingIntent");
                                        }
                                        if (str.isEmpty()) {
                                            wuk = new wuk(wun.f51382a, wun.f51383b, wun.f51384c, wun.f51385d);
                                        } else {
                                            String valueOf = String.valueOf(str);
                                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                        }
                                    } else {
                                        throw new NullPointerException("Null subtitle");
                                    }
                                } else {
                                    throw new NullPointerException("Null title");
                                }
                            } else {
                                throw new NullPointerException("Null icon");
                            }
                        } else {
                            throw new NullPointerException("Null pendingIntent");
                        }
                    }
                    if (wuk != null) {
                        arrayList.add(wuk);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m42311a(apr apr, Uri uri) {
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        wum wum = new wum(atomicReference, countDownLatch, apr, uri);
        apr.mo2274a(uri, wum);
        try {
            wum.mo2272a(apr.mo2277c(uri));
            countDownLatch.await(cfog.f184854a.mo6606a().mo81987aV(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | InterruptedException e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wup", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Error waiting for slice binding for uri %s", uri.toString());
            apr.mo2276b(uri, wum);
        }
        return m42310a((Slice) atomicReference.get());
    }
}
