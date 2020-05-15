package p000;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Post;
import java.util.ArrayList;

/* renamed from: aoms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoms implements rjz, rka {

    /* renamed from: a */
    final /* synthetic */ aomu f78495a;

    public aoms(aomu aomu) {
        this.f78495a = aomu;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        aomu aomu = this.f78495a;
        if (aomu.f78516n == null || aomu.f78514l) {
            aomu.f78504b.mo42332x();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anuy.a(anuv, com.google.android.gms.plus.model.posts.Post):void
     arg types: [aomu, com.google.android.gms.plus.model.posts.Post]
     candidates:
      anuy.a(anmx, java.lang.String):void
      anuy.a(anuq, com.google.android.gms.plus.model.posts.Comment):void
      anuy.a(anur, java.lang.String):void
      anuy.a(anus, java.lang.String):void
      anuy.a(anut, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(anuu, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(aoae, java.lang.String):void
      rjm.a(java.lang.String, java.io.PrintWriter):void
      rjm.a(scb, java.util.Set):void
      anuy.a(anuv, com.google.android.gms.plus.model.posts.Post):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anuy.a(anuu, com.google.android.gms.plus.model.posts.Post):void
     arg types: [aomu, com.google.android.gms.plus.model.posts.Post]
     candidates:
      anuy.a(anmx, java.lang.String):void
      anuy.a(anuq, com.google.android.gms.plus.model.posts.Comment):void
      anuy.a(anur, java.lang.String):void
      anuy.a(anus, java.lang.String):void
      anuy.a(anut, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(anuv, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(aoae, java.lang.String):void
      rjm.a(java.lang.String, java.io.PrintWriter):void
      rjm.a(scb, java.util.Set):void
      anuy.a(anuu, com.google.android.gms.plus.model.posts.Post):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anuy.a(anut, com.google.android.gms.plus.model.posts.Post):void
     arg types: [aomu, com.google.android.gms.plus.model.posts.Post]
     candidates:
      anuy.a(anmx, java.lang.String):void
      anuy.a(anuq, com.google.android.gms.plus.model.posts.Comment):void
      anuy.a(anur, java.lang.String):void
      anuy.a(anus, java.lang.String):void
      anuy.a(anuu, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(anuv, com.google.android.gms.plus.model.posts.Post):void
      anuy.a(aoae, java.lang.String):void
      rjm.a(java.lang.String, java.io.PrintWriter):void
      rjm.a(scb, java.util.Set):void
      anuy.a(anut, com.google.android.gms.plus.model.posts.Post):void */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[LOOP:1: B:19:0x007a->B:20:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x004f A[EDGE_INSN: B:71:0x004f->B:12:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        String[] strArr;
        int length;
        int i;
        aomt aomt;
        int size;
        int i2;
        aomu aomu;
        Uri uri;
        Bundle bundle2;
        aomu aomu2 = this.f78495a;
        aomu2.f78512j = aomu2.f78504b.mo42330c();
        if (this.f78495a.f78509g.mo43049a()) {
            aomu aomu3 = this.f78495a;
            if (aomu3.f78509g.f78529a.equals(aomu3.f78512j)) {
                strArr = new String[]{this.f78495a.f78512j};
                this.f78495a.f78513k = -1;
                length = strArr.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        if (strArr[i].equals(this.f78495a.f78512j)) {
                            this.f78495a.f78513k = i;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (this.f78495a.f78513k < 0) {
                    Log.e("ShareBox", "Resolved account name not found among share eligable accounts");
                    this.f78495a.f78513k = 0;
                }
                aomu aomu4 = this.f78495a;
                aomt = aomu4.f78508f;
                if (aomt != null) {
                    aomt.mo43039a(strArr, aomu4.f78513k);
                }
                aomu aomu5 = this.f78495a;
                size = aomu5.f78526x.size();
                ArrayList arrayList = new ArrayList(size);
                for (i2 = 0; i2 < size; i2++) {
                    arrayList.add((aomq) aomu5.f78526x.get(i2));
                }
                aomu5.f78526x.clear();
                for (int i3 = 0; i3 < size; i3++) {
                    aomq aomq = (aomq) arrayList.get(i3);
                    if (!aomq.mo43027a() || !aomq.mo43028b()) {
                        if (!aomq.mo43029c()) {
                            Log.e("ShareBox", "Unhandled queued log request");
                        } else if (aomq.mo43029c()) {
                            aomu5.mo43044a(aomq.f78491c, aomq.f78489a, aomq.f78492d, aomq.f78493e);
                        } else {
                            Log.e("ShareBox", "Unhandled queued action log request");
                        }
                    } else if (!aomq.mo43027a() || !aomq.mo43028b()) {
                        Log.e("ShareBox", "Unhandled queued navigation log request");
                    } else {
                        aomu5.mo43043a(aomq.f78489a, aomq.f78490b);
                    }
                }
                if (!this.f78495a.f78506d.mo24805i() && !this.f78495a.f78506d.mo24806j()) {
                    this.f78495a.f78506d.mo24801e();
                }
                aomu = this.f78495a;
                if (!aomu.f78514l) {
                    aomu.f78504b.mo42319a((anuv) aomu, aomu.f78515m);
                    return;
                }
                if (aomu.f78509g.mo43053e()) {
                    uri = Uri.parse(this.f78495a.f78509g.f78542n);
                } else {
                    uri = null;
                }
                if (this.f78495a.f78509g.mo43055g()) {
                    bundle2 = this.f78495a.f78509g.f78544p.f78560a;
                } else {
                    bundle2 = null;
                }
                String b = this.f78495a.f78509g.mo43050b();
                aomv aomv = this.f78495a.f78509g;
                Post post = new Post(1, null, null, uri, null, null, null, bundle2, null, aomv.f78534f, true, b, aomv.f78545q);
                aomu aomu6 = this.f78495a;
                if (aomu6.f78516n == null) {
                    aomu6.f78504b.mo42318a((anuu) aomu6, post);
                } else {
                    aomu6.mo42301a(ConnectionResult.f30063a, this.f78495a.f78516n);
                }
                if (this.f78495a.f78518p == null && post.mo46615a()) {
                    aomu aomu7 = this.f78495a;
                    aomu7.f78504b.mo42317a((anut) aomu7, post);
                    return;
                }
                this.f78495a.mo42300a(ConnectionResult.f30063a, this.f78495a.f78518p);
                return;
            }
        }
        strArr = this.f78495a.f78511i;
        this.f78495a.f78513k = -1;
        length = strArr.length;
        i = 0;
        while (true) {
            if (i < length) {
            }
            i++;
        }
        if (this.f78495a.f78513k < 0) {
        }
        aomu aomu42 = this.f78495a;
        aomt = aomu42.f78508f;
        if (aomt != null) {
        }
        aomu aomu52 = this.f78495a;
        size = aomu52.f78526x.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i2 < size) {
        }
        aomu52.f78526x.clear();
        while (i3 < size) {
        }
        this.f78495a.f78506d.mo24801e();
        aomu = this.f78495a;
        if (!aomu.f78514l) {
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        aomu aomu = this.f78495a;
        if (aomu.f78508f != null) {
            if (connectionResult.f30065c == 4) {
                aomu.f78527y = ((Long) ansx.f77675Y.mo25081c()).longValue();
            }
            this.f78495a.f78508f.mo43031a(connectionResult);
        }
    }
}
