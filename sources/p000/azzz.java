package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: azzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzz implements azzy {

    /* renamed from: a */
    private static final ByteString f100351a = ByteString.m123261a(new byte[]{58});

    /* renamed from: b */
    private static final banl f100352b;

    /* renamed from: c */
    private final bamr f100353c;

    /* renamed from: d */
    private final Map f100354d;

    /* renamed from: e */
    private final Context f100355e;

    /* renamed from: f */
    private bamq f100356f;

    static {
        bank a = banl.m87214a();
        a.mo55804a((byte) 58);
        f100352b = a.mo55803a();
    }

    public azzz(bamr bamr, Map map, Context context) {
        this.f100353c = bamr;
        this.f100354d = map;
        this.f100355e = context;
    }

    /* renamed from: a */
    private final bamq m86434a() {
        bamq bamq;
        synchronized (this.f100353c) {
            if (this.f100356f == null) {
                this.f100356f = this.f100353c.mo55779a("broadcastlistenerstorage");
            }
            bamq = this.f100356f;
        }
        return bamq;
    }

    /* renamed from: b */
    private final ByteString m86435b(baab baab) {
        if (this.f100354d.get(bygy.m124802a(baab.mo55529c().f166412a)) != null) {
            return f100352b.mo55805a(ByteString.m123258a(((babq) this.f100354d.get(bygy.m124802a(baab.mo55529c().f166412a))).mo55563a(baab.mo55529c()))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(baab.mo55528b().type))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(baab.mo55528b().name))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(baab.mo55527a()))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(baab.mo55530d())));
        }
        throw new UnsupportedOperationException("Operation not supported for the specified ChannelId.");
    }

    /* renamed from: a */
    public final Collection mo55538a(bygz bygz, Account account) {
        bamq a = m86434a();
        HashSet hashSet = new HashSet();
        if (this.f100354d.get(bygy.m124802a(bygz.f166412a)) != null) {
            byte[] k = f100352b.mo55805a(ByteString.m123258a(((babq) this.f100354d.get(bygy.m124802a(bygz.f166412a))).mo55563a(bygz))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(account.type))).mo73770a(f100351a).mo73770a(f100352b.mo55805a(ByteString.m123258a(account.name))).getKey();
            byte[] a2 = baqr.m87412a(k);
            banx a3 = a.mo55766a().mo55798a();
            try {
                for (Pair pair : a.mo55768a(a3, k, a2)) {
                    bygr bygr = (bygr) GeneratedMessageLite.m124014a(bygr.f166375e, (byte[]) pair.second);
                    baab a4 = baab.m86441a(bygr.f166379c, account, bygz, bygr.f166380d);
                    bygx bygx = bygr.f166378b;
                    if (bygx == null) {
                        bygx = bygx.f166401c;
                    }
                    hashSet.add(Pair.create(a4, baac.m86446a(bygx)));
                }
                a3.close();
                return hashSet;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new UnsupportedOperationException("Operation not supported for the specified ChannelId.");
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo55539a(baab baab) {
        bamq a = m86434a();
        bany b = a.mo55766a().mo55799b();
        try {
            a.mo55770a(b, m86435b(baab));
            b.mo55796b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo55540a(baab baab, baac baac) {
        bamq a = m86434a();
        bany b = a.mo55766a().mo55799b();
        try {
            ByteString b2 = m86435b(baab);
            bxvd da = bygr.f166375e.mo74144da();
            String a2 = baab.mo55527a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygr bygr = (bygr) da.f164949b;
            a2.getClass();
            bygr.f166377a |= 2;
            bygr.f166379c = a2;
            String d = baab.mo55530d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bygr bygr2 = (bygr) da.f164949b;
            d.getClass();
            int i = bygr2.f166377a | 4;
            bygr2.f166377a = i;
            bygr2.f166380d = d;
            bygx bygx = ((azzx) baac).f100350a;
            bygx.getClass();
            bygr2.f166378b = bygx;
            bygr2.f166377a = i | 1;
            a.mo55771a(b, b2, ((bygr) da.mo74062i()).mo73639aL());
            b.mo55796b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bamq.a(banx, bxtx):bxtx
     arg types: [bany, bxtx]
     candidates:
      bamq.a(bany, bxtx):void
      bamq.a(banx, byte[]):byte[]
      bamq.a(banx, bxtx):bxtx */
    /* renamed from: a */
    public final void mo55541a(Collection collection) {
        bamq a = m86434a();
        bany b = a.mo55766a().mo55799b();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ByteString b2 = m86435b((baab) it.next());
                bygr bygr = (bygr) GeneratedMessageLite.m124007a(bygr.f166375e, a.mo55767a((banx) b, b2));
                Intent intent = new Intent();
                intent.setPackage(bygr.f166379c);
                intent.setAction(bygr.f166380d);
                this.f100355e.sendBroadcast(intent);
                a.mo55770a(b, b2);
            }
            b.mo55796b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
