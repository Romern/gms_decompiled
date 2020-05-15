package p000;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* renamed from: wxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wxe extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ File f51533a;

    /* renamed from: b */
    final /* synthetic */ List f51534b;

    public wxe(File file, List list) {
        this.f51533a = file;
        this.f51534b = list;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f51533a));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.f51534b.add(readLine);
            }
        } catch (IOException e) {
        }
        return (String[]) this.f51534b.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
    }
}
