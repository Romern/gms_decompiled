package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Pair;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: acvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acvn extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ acvp f60889a;

    public acvn(acvp acvp) {
        this.f60889a = acvp;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        acvm acvm = new acvm();
        sdo.m34974b(strArr.length == 1);
        Context context = this.f60889a.getContext();
        if (context != null) {
            String str = strArr[0];
            apne b = aplx.m70650b(context);
            roz b2 = rpa.m34196b();
            b2.f43472a = new apnv(str);
            try {
                acvm.f60888c = (rkj) aucu.m76782a(((rjx) b).mo24701a(b2.mo24977a()));
                rkj rkj = acvm.f60888c;
                ArrayList arrayList = new ArrayList();
                aplz aplz = null;
                if (rkj.mo24815i() != null) {
                    Context context2 = this.f60889a.getContext();
                    if (context2 != null) {
                        CorpusConfigParcelable[] i = rkj.mo24815i();
                        int length = i.length;
                        int i2 = 0;
                        boolean z = true;
                        while (i2 < length) {
                            CorpusConfigParcelable corpusConfigParcelable = i[i2];
                            String str2 = corpusConfigParcelable.f107359a;
                            String str3 = corpusConfigParcelable.f107360b;
                            apsn a = aplx.m70649a(context2, aplz);
                            frv frv = new frv();
                            frv.mo11222c();
                            frv.f17159a = new STSortSpec("(GET_NUM _DOC_SCORE)");
                            int i3 = -1;
                            try {
                                i3 = ((SearchResults) aucu.m76782a(a.mo47578a("", str2, new String[]{str3}, 0, 1, frv.mo11219a()))).f9676m;
                            } catch (InterruptedException | ExecutionException e) {
                                if (e.getCause() instanceof rjp) {
                                    absg.m48192b("Query failed: %s", e.getCause().getMessage());
                                }
                            }
                            if (i3 >= 0) {
                                z = false;
                            }
                            if (i3 > 0) {
                                arrayList.add(new acuc(corpusConfigParcelable, i3));
                            }
                            i2++;
                            aplz = null;
                        }
                        if (z) {
                            if (rkj.mo24815i().length > 0) {
                            }
                        }
                        Collections.sort(arrayList, new acub());
                    }
                    arrayList = null;
                }
                if (arrayList != null) {
                    acvm.f60886a = 0;
                    acvm.f60887b = arrayList;
                } else {
                    acvm.f60886a = 8;
                }
            } catch (InterruptedException | ExecutionException e2) {
                if (e2.getCause() instanceof rjp) {
                    acvm.f60886a = ((rjp) e2.getCause()).mo24655a();
                } else {
                    acvm.f60886a = 8;
                }
            }
        } else {
            acvm.f60886a = 8;
        }
        return acvm;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Context context;
        acvm acvm = (acvm) obj;
        if (this.f60889a.isAdded() && (context = this.f60889a.getContext()) != null) {
            this.f60889a.f60895e.setVisibility(8);
            boolean z = false;
            this.f60889a.f60907q.mo2090a(false);
            if (acvm.f60886a != 0) {
                acua.m49854a(context, context.getString(C0126R.string.package_details_title), context.getString(C0126R.string.failed_retrieve_package_details), Integer.valueOf(acvm.f60886a));
                return;
            }
            this.f60889a.f60894d.setVisibility(0);
            List list = acvm.f60887b;
            this.f60889a.f60891a.clear();
            this.f60889a.f60891a.addAll(list);
            this.f60889a.f60892b.notifyDataSetChanged();
            acua.m49858a(this.f60889a.f60893c);
            rkj rkj = acvm.f60888c;
            if (this.f60889a.mo33148c()) {
                this.f60889a.f60896f.clear();
                if (this.f60889a.mo33148c() && rkj.mo24818l() != null) {
                    HashMap hashMap = new HashMap();
                    AppIndexingUserActionInfo[] l = rkj.mo24818l();
                    for (AppIndexingUserActionInfo appIndexingUserActionInfo : l) {
                        ArrayList arrayList = (ArrayList) hashMap.get(appIndexingUserActionInfo.f107354c.f152341a);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap.put(appIndexingUserActionInfo.f107354c.f152341a, arrayList);
                        }
                        arrayList.add(appIndexingUserActionInfo);
                    }
                    for (String str : hashMap.keySet()) {
                        ArrayList arrayList2 = (ArrayList) hashMap.get(str);
                        Collections.sort(arrayList2, new apmc());
                        this.f60889a.f60896f.add(new acwf(str, arrayList2));
                    }
                }
                this.f60889a.f60898h.notifyDataSetChanged();
                acua.m49858a(this.f60889a.f60897g);
            }
            rkj rkj2 = acvm.f60888c;
            if (this.f60889a.mo33147b()) {
                this.f60889a.f60899i.clear();
                if (this.f60889a.mo33147b() && rkj2.mo24817k() != null) {
                    HashMap hashMap2 = new HashMap();
                    AppIndexingErrorInfo[] k = rkj2.mo24817k();
                    for (AppIndexingErrorInfo appIndexingErrorInfo : k) {
                        Pair pair = new Pair(Integer.valueOf(appIndexingErrorInfo.f107346b), Integer.valueOf(appIndexingErrorInfo.f107347c));
                        ArrayList arrayList3 = (ArrayList) hashMap2.get(pair);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap2.put(pair, arrayList3);
                        }
                        arrayList3.add(appIndexingErrorInfo);
                    }
                    for (Pair pair2 : hashMap2.keySet()) {
                        ArrayList arrayList4 = (ArrayList) hashMap2.get(pair2);
                        Collections.sort(arrayList4, new apma());
                        this.f60889a.f60899i.add(new acuj((bpzo) bmxu.m108565a(bpzo.m112438a(((Integer) pair2.first).intValue()), bpzo.UNRECOGNIZED), (bpzq) bmxu.m108565a(bpzq.m112442a(((Integer) pair2.second).intValue()), bpzq.UNRECOGNIZED), ((AppIndexingErrorInfo) arrayList4.get(0)).f107349e, arrayList4));
                    }
                }
                this.f60889a.f60901k.notifyDataSetChanged();
                acua.m49858a(this.f60889a.f60900j);
            }
            rkj rkj3 = acvm.f60888c;
            GetAppIndexingPackageDetailsCall$Response getAppIndexingPackageDetailsCall$Response = (GetAppIndexingPackageDetailsCall$Response) rkj3.f43190a;
            if (getAppIndexingPackageDetailsCall$Response.f107368f && !getAppIndexingPackageDetailsCall$Response.f107369g) {
                this.f60889a.f60904n.setVisibility(0);
            }
            if (this.f60889a.f60910t) {
                if (rkj3.mo24816j() == -1) {
                    acvp acvp = this.f60889a;
                    acvp.f60903m.setText(acvp.f60908r.getString(C0126R.string.update_index_description_error_sending, new Object[]{"UPDATE_INDEX"}));
                } else if (rkj3.mo24816j() != 0) {
                    String a = acua.m49851a(rkj3.mo24816j());
                    acvp acvp2 = this.f60889a;
                    acvp2.f60903m.setText(acvp2.f60908r.getString(C0126R.string.update_index_description_sent_time, new Object[]{"UPDATE_INDEX", a}));
                } else {
                    acvp acvp3 = this.f60889a;
                    acvp3.f60903m.setText(acvp3.f60908r.getString(C0126R.string.update_index_description_never_sent, new Object[]{"UPDATE_INDEX"}));
                }
            }
            acvp acvp4 = this.f60889a;
            Button button = acvp4.f60902l;
            if (button != null) {
                if (!acvp4.f60899i.isEmpty() || !this.f60889a.f60896f.isEmpty()) {
                    z = true;
                }
                button.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f60889a.isAdded()) {
            this.f60889a.f60894d.setVisibility(8);
            this.f60889a.f60895e.setVisibility(0);
        }
    }
}
