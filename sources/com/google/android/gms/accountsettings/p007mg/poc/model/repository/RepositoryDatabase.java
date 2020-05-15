package com.google.android.gms.accountsettings.p007mg.poc.model.repository;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class RepositoryDatabase extends C0953ec {

    /* renamed from: e */
    static final C0961ek f7751e = new era();

    /* renamed from: f */
    static final C0961ek f7752f = new erb();

    /* renamed from: g */
    static final C0961ek f7753g = new erc();

    /* renamed from: h */
    static final C0961ek f7754h = new erd();

    /* renamed from: i */
    static final C0961ek f7755i = new ere();

    /* renamed from: a */
    public static RepositoryDatabase m4960a(Context context) {
        int i;
        C0951ea a = C0949dz.m9854a(context, RepositoryDatabase.class, "account_settings_repository.db");
        C0961ek[] ekVarArr = {f7751e, f7752f, f7753g, f7754h, f7755i};
        if (a.f14522b == null) {
            a.f14522b = new HashSet();
            i = 0;
        } else {
            i = 0;
        }
        while (i < 5) {
            C0961ek ekVar = ekVarArr[i];
            a.f14522b.add(Integer.valueOf(ekVar.f15164a));
            a.f14522b.add(Integer.valueOf(ekVar.f15165b));
            i++;
        }
        C0952eb ebVar = a.f14521a;
        for (int i2 = 0; i2 < 5; i2++) {
            C0961ek ekVar2 = ekVarArr[i2];
            int i3 = ekVar2.f15164a;
            int i4 = ekVar2.f15165b;
            HashMap hashMap = ebVar.f14582a;
            Integer valueOf = Integer.valueOf(i3);
            TreeMap treeMap = (TreeMap) hashMap.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                ebVar.f14582a.put(valueOf, treeMap);
            }
            Integer valueOf2 = Integer.valueOf(i4);
            C0961ek ekVar3 = (C0961ek) treeMap.get(valueOf2);
            if (ekVar3 != null) {
                Log.w("ROOM", "Overriding migration " + ekVar3 + " with " + ekVar2);
            }
            treeMap.put(valueOf2, ekVar2);
        }
        a.mo9901b();
        return (RepositoryDatabase) a.mo9900a();
    }

    /* renamed from: k */
    public abstract erg mo6323k();

    /* renamed from: l */
    public abstract epw mo6324l();

    /* renamed from: m */
    public abstract eqo mo6325m();
}
