package p000;

import android.content.Context;
import android.os.Environment;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;

/* renamed from: mml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mml implements Callable {

    /* renamed from: a */
    private final Context f34011a;

    public mml(Context context) {
        this.f34011a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mhg mhg = new mhg(this.f34011a);
        mhl mhl = new mhl(new String[]{Environment.DIRECTORY_DCIM, Environment.DIRECTORY_ALARMS, Environment.DIRECTORY_DOCUMENTS, Environment.DIRECTORY_DOWNLOADS, Environment.DIRECTORY_MOVIES, Environment.DIRECTORY_MUSIC, Environment.DIRECTORY_NOTIFICATIONS, Environment.DIRECTORY_PICTURES, Environment.DIRECTORY_PODCASTS, Environment.DIRECTORY_RINGTONES});
        List a = mhg.mo20014a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            mhl.mo20016a((String) a.get(i));
        }
        List a2 = mhg.mo20014a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            mhl.mo20016a((String) a2.get(i2));
        }
        List a3 = mhg.mo20014a(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        int size3 = a3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            mhl.mo20017a((String) a3.get(i3), "audio");
        }
        ArrayList arrayList = new ArrayList();
        List list = mhl.f33731b;
        int size4 = list.size();
        for (int i4 = 0; i4 < size4; i4++) {
            mhi mhi = (mhi) list.get(i4);
            String str = mhi.f33723a;
            Matcher matcher = mhl.f33732c.matcher(str);
            if (matcher.find()) {
                String substring = str.substring(0, matcher.start());
                String group = matcher.group(1);
                String substring2 = str.substring(matcher.end());
                if (!mhl.f33734e.containsKey(substring)) {
                    Map map = mhl.f33734e;
                    int size5 = map.size();
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("storage-");
                    sb.append(size5);
                    map.put(substring, sb.toString());
                }
                mhl.f33735f.add(group);
                mhl.mo20019a(new mhk(new mhj(substring, group, substring2), mhi.f33724b));
            } else {
                arrayList.add(mhi);
            }
        }
        int size6 = arrayList.size();
        for (int i5 = 0; i5 < size6; i5++) {
            mhi mhi2 = (mhi) arrayList.get(i5);
            Iterator it = mhl.f33734e.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    mhl.f33730a.mo25416d("Couldn't map %s to a target path. Will use absolute path.", mhi2.f33723a);
                    mhk mhk = new mhk(new mhj("/", "", mhi2.f33723a), mhi2.f33724b);
                    mhl.f33735f.add("");
                    mhl.mo20019a(mhk);
                    break;
                }
                String str2 = (String) it.next();
                if (mhi2.f33723a.startsWith(str2)) {
                    mhk mhk2 = new mhk(new mhj(str2, "", mhi2.f33723a.substring(str2.length() + 1)), mhi2.f33724b);
                    mhl.f33735f.add("");
                    mhl.mo20019a(mhk2);
                    break;
                }
            }
        }
        for (String str3 : mhl.f33735f) {
            List<mhk> list2 = (List) mhl.f33733d.get(str3);
            HashSet hashSet = new HashSet();
            if (mhl.f33734e.size() > 1) {
                for (mhk mhk3 : list2) {
                    if (!hashSet.contains(mhk3.f33728a.f33727c)) {
                        hashSet.add(mhk3.f33728a.f33727c);
                    } else {
                        for (mhk mhk4 : list2) {
                            mhj mhj = mhk4.f33728a;
                            mhl.mo20018a(mhk4.f33729b, new mhh(mhk4.f33728a.mo20015a(), mhl.m25116a(mhj.f33726b, (String) mhl.f33734e.get(mhj.f33725a), mhj.f33727c)));
                        }
                    }
                }
            }
            for (mhk mhk5 : list2) {
                String str4 = mhk5.f33729b;
                String a4 = mhk5.f33728a.mo20015a();
                mhj mhj2 = mhk5.f33728a;
                mhl.mo20018a(str4, new mhh(a4, mhl.m25116a(mhj2.f33726b, mhj2.f33727c)));
            }
        }
        return mhl;
    }
}
