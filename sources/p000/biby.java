package p000;

import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: biby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biby implements Callable {

    /* renamed from: a */
    private final bibq f120176a;

    /* renamed from: b */
    private final bvmo[] f120177b;

    public biby(bibq bibq, bvmo[] bvmoArr) {
        this.f120176a = bibq;
        this.f120177b = bvmoArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bibq bibq = this.f120176a;
        bvmo[] bvmoArr = this.f120177b;
        bibx bibx = bibq.f120155b;
        int b = stu.m36316b();
        int i = ModuleManager.get(bibq.f120154a).getCurrentModule().moduleVersion;
        bxvd da = bvug.f157682e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvug bvug = (bvug) da.f164949b;
        int i2 = bvug.f157684a | 1;
        bvug.f157684a = i2;
        bvug.f157685b = b;
        bvug.f157684a = i2 | 2;
        bvug.f157686c = i;
        for (bvmo bvmo : bvmoArr) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvug bvug2 = (bvug) da.f164949b;
            bvmo.getClass();
            if (!bvug2.f157687d.mo73666a()) {
                bvug2.f157687d = bxvk.m124021a(bvug2.f157687d);
            }
            bvug2.f157687d.add(bvmo);
        }
        bvug bvug3 = (bvug) da.mo74062i();
        long c = cghh.m145422c();
        if (bibx.f120170c == null) {
            bibx.f120170c = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/GetDevicePlaceInferenceModel", ciie.m150370a(bvug.f157682e), ciie.m150370a(bvuh.f157688d));
        }
        return (bvuh) bibx.f120175a.mo25554a(bibx.f120170c, bvug3, c, TimeUnit.MILLISECONDS);
    }
}
