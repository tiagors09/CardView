package br.com.tiagors09.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.tiagors09.cardview.R;
import br.com.tiagors09.cardview.model.Postagem;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.PostagemHolder> {
    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> p) {
        this.postagens = p;
    }

    @NonNull
    @Override
    public PostagemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.postagem, parent, false);

        return new PostagemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostagemHolder holder, int position) {
        Postagem p = postagens.get(position);
        holder.nome.setText(p.getNome());
        holder.postagem.setText(p.getPostagem());
        holder.imagem.setImageResource(p.getImagem());
    }

    @Override
    public int getItemCount() {
        return this.postagens.size();
    }

    public class PostagemHolder extends RecyclerView.ViewHolder {
        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public PostagemHolder(@NonNull View itemView) {
            super(itemView);

            this.nome = itemView.findViewById(R.id.textViewNome);
            this.postagem = itemView.findViewById(R.id.textViewPostagem);
            this.imagem = itemView.findViewById(R.id.imageViewImagem);
        }
    }
}
