// Generated by view binder compiler. Do not edit!
package vn.edu.usth.wordpress25.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.wordpress25.R;

public final class Fragment2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final RecyclerView rcvDiscovery;

  @NonNull
  public final TextView tvTitle;

  private Fragment2Binding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout ll,
      @NonNull RecyclerView rcvDiscovery, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.ll = ll;
    this.rcvDiscovery = rcvDiscovery;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll;
      LinearLayout ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.rcv_discovery;
      RecyclerView rcvDiscovery = ViewBindings.findChildViewById(rootView, id);
      if (rcvDiscovery == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new Fragment2Binding((ConstraintLayout) rootView, ll, rcvDiscovery, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
