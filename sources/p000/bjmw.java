package p000;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: bjmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmw extends bjhy {

    /* renamed from: p */
    bwqr f122988p;

    /* renamed from: q */
    boolean f122989q;

    public bjmw(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        Uri data;
        if (i == 2001) {
            int b = bjfv.m103325b(bjfd);
            if (b == -1) {
                Intent a = bjfv.m103323a(bjfd);
                ArrayList arrayList = new ArrayList(1);
                if (a != null) {
                    if (a.getClipData() != null) {
                        ClipData clipData = a.getClipData();
                        int itemCount = clipData.getItemCount();
                        ArrayList arrayList2 = new ArrayList(itemCount);
                        int i2 = 0;
                        while (true) {
                            if (i2 < itemCount) {
                                Uri uri = clipData.getItemAt(i2).getUri();
                                if (uri == null) {
                                    arrayList2.clear();
                                    break;
                                } else {
                                    arrayList2.add(uri.toString());
                                    i2++;
                                }
                            } else {
                                break;
                            }
                        }
                        arrayList = arrayList2;
                    } else if (!(a.getData() == null || (data = a.getData()) == null)) {
                        arrayList.add(data.toString());
                    }
                }
                if (arrayList.isEmpty()) {
                    mo65256s();
                } else {
                    bjmx bjmx = (bjmx) ((bjhy) this).f122754m;
                    bjmx.f122990d.addAll(arrayList);
                    bjmx.mo65244a((bjgf) null);
                    mo65255r();
                }
            } else if (b != 0) {
                mo65256s();
            } else {
                mo65254q();
            }
            this.f122989q = false;
            return;
        }
        super.mo52014a(i, bjfd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmx bjmx = (bjmx) ((bjhy) this).f122754m;
        return bjmx == null ? new bjmx() : bjmx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        if (!this.f122989q) {
            bjmx bjmx = (bjmx) ((bjhy) this).f122754m;
            if (!bjmx.f122990d.isEmpty()) {
                bjmx.f122990d.clear();
                bjmx.mo65244a((bjgf) null);
            }
            bjfh n = mo65128n();
            boolean z = this.f122988p.f160715b;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setAction("android.intent.action.GET_CONTENT");
            int i = Build.VERSION.SDK_INT;
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.f122988p.f160714a.toArray(new String[0]));
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            intent.addCategory("android.intent.category.OPENABLE");
            n.mo65084a(2001, bjfv.m103324a(intent, this.f122639a.f122692a.f122724a));
            this.f122989q = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("isRunning", this.f122989q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122989q = bundle.getBoolean("isRunning");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqr.f160712d;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122988p = (bwqr) b;
    }
}
